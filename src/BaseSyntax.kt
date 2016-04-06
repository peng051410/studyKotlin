/**
 * zhipeng.li@chelaile.net.cn
 * Created by tomyli on 2016/04/06 21:22.
 */
fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sumInferred(1, 3))
    printSum(2, 3)
    println()
    println(getStringLength("ddd"))
    cases(2)
    println()
    forAny()
}

/******************************定义方法****************************************/
/**
 * 定义function
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * 推断出返回值类型
 */
fun sumInferred(a: Int, b: Int) = a + b

/**
 * 无返回值,Unit可以省略
 */
fun printSum(a: Int, b: Int): Unit {
    val c: Int
    c = 1
    print(a + b + c)
}

/******************************定义变量****************************************/
val a: Int = 1
val b = 2

/******************************判断语句****************************************/
fun max(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String) : Int? {
    return 1
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun cases(obj :Any) {
    when(obj) {
        1 -> print("One")
        "Hello" -> print("Greeting")
        is Long -> print("Long")
        !is String -> print("Not a string")
        else -> print("Unknown" )
    }
}

fun forAny() {
    for(x in 1..5) {
        print(x)
    }
}

