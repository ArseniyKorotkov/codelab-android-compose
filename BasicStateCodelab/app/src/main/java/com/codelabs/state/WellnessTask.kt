package com.codelabs.state

data class WellnessTask(val id: Int, val label: String)

fun getWellnessTasks() = List(30) { i ->
    WellnessTask(
        id = i,
        label = "Task #$i"
    )
}