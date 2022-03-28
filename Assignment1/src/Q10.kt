class Q10 {//Right a kotlin Program to calculate power using recursion.

    private var base: Double = 0.0
    private var power: Int = 0
    private var res: Double = 0.0

    constructor(base: Double, power: Int){
        this.base = base
        this.power = power
    }

    private fun helper(base: Double, power: Int): Double{
        if(power == 1)
            return base
        return base * helper(base, power-1)
    }

    fun calcPow(): Double{
        return helper(base, power);
    }
}


fun main(){
    //take base and power noms.
    var flag = true
    var base: Double = 0.0
    var power: Int = 0
    do {
        try {
            print("enter base: ")
            base = readln().toDouble()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)

    flag = true
    do {
        try {
            print("enter power: ")
            power = readln().toInt()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter Integer number")
        }
    }while (flag)

    var obj: Q10 = Q10(base, power)

    println("the result is: ${obj.calcPow()}")
}