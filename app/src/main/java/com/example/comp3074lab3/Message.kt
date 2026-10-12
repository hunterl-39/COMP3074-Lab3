package com.example.comp3074lab3

data class Message(
    val id: Int,
    val sender: String,
    val text: String
)

val sampleMessages = listOf(
    Message(1, "Joe", "Hi!"),
    Message(2, "Jim", "How are you?"),
    Message(3, "Joe", "Test..1..2...3"),
    Message(4, "Joe", "I hate coding!!!"),
    Message(5, "Joe", "Hi!"),
    Message(6, "Jim", "How are you?"),
    Message(7, "Joe", "Test..1..2...3"),
    Message(8, "Joe", "I hate coding!!!"),
    Message(9, "Joe", "Hi!"),
    Message(10, "Jim", "How are you?"),
    Message(11, "Joe", "Test..1..2...3"),
    Message(12, "Joe", "I hate coding!!!")
)
