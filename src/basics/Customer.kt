package basics

class Customer {
    class  Contact(val id: Int, var email: String)
}

fun main() {
    val customer = Customer()

    val contact = Customer.Contact(1, "xyz@gmail.com")

    println(contact.email)


}