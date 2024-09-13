package com.example.myapplication

data class Vegetable (var name: String, var age: Int, var originCountry: String)

fun main()
{
    val vegetables = listOf(
        Vegetable("Tomato", 10, "Spain"),
        Vegetable("Cabbage", 3, "Japan"),
        Vegetable("Cucumber", 11, "Great Britain")
    )
    for (vegetable in vegetables) {
        println(vegetable.name)
    }
    val oldestVegetable = vegetables.maxByOrNull { it.age }

    if (oldestVegetable != null) {
        println("Najstarsze warzywo to ${oldestVegetable.name}")
    }
    for (vegetable in vegetables) {
        println("${vegetable.name} pochodzi z ${vegetable.originCountry} i ma ${vegetable.age} lat")
    }


}
