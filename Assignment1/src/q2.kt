class Q2 {//Right Kotlin Program to check whether a number is Even or Odd.

    var number: Int
    constructor(number: Int){
        this.number = number
    }
    fun checkEvenOrOdd(): Boolean{
        return number % 2 == 0
    }
}

fun main(){
    var flag = true
    var num: Int = 0

    //take no.
    do {
        try {
            print("enter num: ")
            num = readLine()!!.toInt()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)
    var obj: Q2 = Q2(num)
    if(obj.checkEvenOrOdd())
        println("this no. is even")
    else
        println("this no. is odd")
}