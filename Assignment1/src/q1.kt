class Main {
    private var num1: Double
    private var num2: Double

    constructor(num1: Double, num2: Double){
        this.num1 = num1
        this.num2 = num2
    }
    fun add(): Double {
        return num1 + num2;
    }
    fun min(): Double {
        return num1 - num2;
    }
    fun star(): Double {
        return num1 * num2;
    }
    fun div(): Double {
        return num1 / num2;
    }
}
fun main(){
    var flag = true
    var num1: Double = 0.0
    var num2: Double = 0.0

    //take first no
    flag = true
    do {
        try {
            print("enter num1: ")
            num1 = readLine()!!.toDouble()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)

    //take second no
    flag = true
    do {
        try {
            print("enter num2: ")
            num2 = readLine()!!.toDouble()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)


    var ma: Main = Main(num1, num2)

    print("operation (+, -, *, /): ")
    var operation: String = readLine()!!

    when(operation){
        "+"-> println("num1 + num2 = ${ma.add()}")
        "-"-> println("num1 - num2 = ${ma.min()}")
        "*"-> println("num1 * num2 = ${ma.star()}")
        "/"-> println("num1 / num2 = ${ma.div()}")
        else -> println("not valid operation")
    }
}
