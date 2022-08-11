package com.example.mycomposableapp

sealed class CalculatorOperations(val symbol:String){
    object Add : CalculatorOperations(symbol = "+")
    object Minus : CalculatorOperations(symbol = "-")
    object Multiply : CalculatorOperations(symbol = "×")
    object Divide : CalculatorOperations(symbol = "/")
}
