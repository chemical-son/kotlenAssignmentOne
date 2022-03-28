class Q5 {//Right a kotlin program to check Whether a Number is Positive or Negative.

    var number: Int
    constructor(number: Int){
        this.number = number
    }
    fun checkPveNeg(): Int{
        if (number > 0)
            return 1
        else if (number < 0)
            return -1
        else
            return 0
    }
}

fun main(){
    var flag = true
    var num: Int = 0

    //take no.
    do {
        try {
            print("enter num: ")
            num = readln().toInt()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)
    var obj: Q5 = Q5(num)
    if(obj.checkPveNeg() == 1)
        println("this no. +ve")
    else if(obj.checkPveNeg() == -1)
        println("this no. -ve")
    else
        println("this no. is zero")
}