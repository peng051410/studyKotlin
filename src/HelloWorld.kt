/**
 * peng051410@gmail.com
 * Created by tomyli on 2016/04/03 21:46.
 */
fun main(args: Array<String>) {
    println("hello world")

    var name = "lzp"

    println(name)

    val testName: String? = null

    println(testName)

    printHello();
    addTwoNumbers(2, 3)
    addTwoNumbers(first = 3, second = 4)
    addTwoNumbers(second = 3, first = 4)

    println(addNumbers(1, 2, 3, 4, 5))

    addTwoNumbers(9)

    val myClass = myClass(1, "lzp")
    myClass.id
    myClass.name
}

fun printHello() {
    println("Hello")
}


fun addTwoNumbers(first: Int, second: Int = 0): Int {
    return first + second
}

fun addNumbers(vararg num: Int): Int {
    return num.sum();
}

class myClass(val id : Int, val name : String) {

}
