package basics

class collect {
}

fun main() {
    val items = listOf("apple","banana","grapes")
    when{
        "orange" in items -> println("juicy")
        "apple" in items -> print("apple is fine too")
    }
}