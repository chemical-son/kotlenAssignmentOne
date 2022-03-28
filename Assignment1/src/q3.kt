class Q3 {//Right a kotlin program to Find Largest Among three numbers.

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
    var flag = true
    var num = Array<Double>(3){0.0}

    //take no.
    for (i in 0..2){
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
    var obj: Q3 = Q3(num)

   println("max no. is: ${obj.getMaxNo()}")
}