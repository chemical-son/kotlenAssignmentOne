import kotlin.math.pow
class Q9 {//Right a kotlin program to convert binary number to decimal.

    private var binary: String
    constructor(binary: String){
        this.binary = binary
    }
    fun convertBinaryToDecimal(): Double{
        var helper: Double = binary.length - 1.0
        var base: Double = 2.0
        var decimalRes: Double = 0.0
        for (i in binary){
            decimalRes += Integer.parseInt(i.toString()) * base.pow(helper--)
        }
        return decimalRes
    }
}

fun CheckIsBinary(binary: String): Boolean{
    for(i in binary){
        if(i != '1' && i != '0')
            return false
    }
    return true
}

fun main(){
    //take Binary input
    var flag = true
    var binaryAsStr: String = ""
    do {
        try {
            print("enter binary no.: ")
            binaryAsStr = readln()
            binaryAsStr = binaryAsStr.trim()
            println("/$binaryAsStr/")
            if(binaryAsStr.indexOf(' ') == -1){
                if(CheckIsBinary(binaryAsStr))
                    flag = false
                else
                    println("you should enter binary number contains only zeros and ones")
            }
            else
                println("you should enter binary no without any spaces")
        }
        catch (e: NumberFormatException){
            println("you should enter number")
        }
    }while (flag)

    var obj: Q9= Q9(binaryAsStr)

    println("decimal result: ${obj.convertBinaryToDecimal()}")
}