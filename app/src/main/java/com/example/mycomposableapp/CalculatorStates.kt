package com.example.mycomposableapp

data class CalculatorStates(
    val number1:String="",
    val number2:String="",
    val operation:CalculatorOperations? = null,
)
