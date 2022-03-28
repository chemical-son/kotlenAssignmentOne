class Q6 {//Right a kotlin program that Find largest element in an array.

    var number: Array<Double>
    constructor(number: Array<Double>){
        this.number = number
    }
    fun getMaxNo(): Double{
        var max: Double = number[0]
        for (element in number){
            if (element > max){
                max = element
            }
        }
        return max
    }
}


fun main(){
    var sizeOfArray: Int = 0
    var flag = true
    do {
        try {
            print("enter size of array: ")
            sizeOfArray = readln().toInt()
            if(sizeOfArray > 0)
                flag = false
            else
                println("you should enter positive number")
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)


    var num = Array<Double>(sizeOfArray){0.0}

    //take no.
    for (i in 0 until sizeOfArray){
        do {
            try {
                print("enter num ${i + 1}: ")
                num[i] = readln().toDouble()
                flag = false
            }
            catch (e: NumberFormatException){
                println("you should enter number")
            }
        }while (flag)
    }
    var obj: Q6 = Q6(num)

    println("max no. is: ${obj.getMaxNo()}")
}