package ru.myitschool.lab23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.dialog,container,false)
        val btn: Button = view.findViewById(R.id.button)
        btn.setOnClickListener {
            // изменение ViewModel
            // Создаем объект типа MyItem
            // (activity as MainActivity).myViewModel.addMyItem()
        }
        return view
    }
}