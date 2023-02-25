package ru.myitschool.lab23

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

data class MyItem(val type: String, val date: LocalDate, val amount: Double)

private var list: List<MyItem>? = null


class MainActivity : AppCompatActivity() {

    val myViewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = MyAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val total: TextView = findViewById(R.id.textView)

        // наблюдение за списком

        myViewModel.balance.observe(this) {
            total.text = it.toString()
        }
    }
}