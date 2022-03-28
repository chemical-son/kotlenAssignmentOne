class Q8 {//Right a kotlin program to Find Factorial of a Number

    private var num: Int
    constructor(number: Int){
        this.num = number
    }
    fun factorial(): Int{
        var res: Int = 1
        for (i in num downTo 1){
            res *= i
        }
        return res
    }
}


fun main(){
    //take no.
    var flag = true
    var num: Int = 0
    do {
        try {
            print("enter number: ")
            num = readln().toInt()
            if(num > -1)
                flag = false
            else
                println("you should enter positive number")
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)

    var obj: Q8 = Q8(num)

    if(obj.factorial() == 0)
        println("the result out of the range!")
    else
        print("factorial of $num: ${obj.factorial()}")
}