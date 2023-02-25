package ru.myitschool.lab23

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalDate

class MyViewModel : ViewModel() {
    private val _balance : MutableLiveData<Double> = MutableLiveData(0.0)
    val balance: LiveData<Double> = _balance

    private val _list : MutableLiveData<ArrayList<MyItem>> = MutableLiveData(
        arrayListOf(MyItem("Income", LocalDate.now(), 0.0))
    )
    val list: LiveData<ArrayList<MyItem>> = _list

    fun addMyItem(item: MyItem) {
        _list.value = _list.value?.apply { add(item) }
        // пересчет стоимости
    }

    fun removeMyItem(index: Int) {
        _list.value?.removeAt(index)
        // пересчет стоимости
    }

    fun duplicateMyItem(index: Int) {
        _list.value?.let { addMyItem(it.get(index)) }
        // пересчет стоимости
    }
}