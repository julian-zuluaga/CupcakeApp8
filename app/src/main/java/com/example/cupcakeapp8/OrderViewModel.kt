package com.example.cupcakeapp8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    // Cantidad de cupcakes
    private val _quantity = MutableLiveData<Int>(0)
    val quantity: LiveData<Int> = _quantity

    // Sabor seleccionado
    private val _flavor = MutableLiveData<String>("")
    val flavor: LiveData<String> = _flavor

    // Fecha de entrega seleccionada
    private val _date = MutableLiveData<String>("")
    val date: LiveData<String> = _date

    /** --- Métodos para actualizar el pedido --- */
    fun setQuantity(number: Int) {
        _quantity.value = number
    }

    fun setFlavor(selected: String) {
        _flavor.value = selected
    }

    fun setDate(selected: String) {
        _date.value = selected
    }

    fun resetOrder() {
        _quantity.value = 0
        _flavor.value = ""
        _date.value = ""
    }
}
