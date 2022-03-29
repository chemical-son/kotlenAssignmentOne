class Q7 {//Right a Kotlin Program to Convert String to char array.

    private var str: String
    constructor(number: String){
        this.str = number
    }
    fun strToCharSeq(): Array<Char>{
        var charsArray: Array<Char> = Array<Char>(str.length){'\\'}
        for (i in str.indices){
            charsArray[i] = str[i]
        }
        return charsArray
    }
}


fun main(){
    //take string
    print("enter string: ")
    var str: String = readLine()!!
    var obj: Q7 = Q7(str)

    println("seq of chars:")
    for (i in obj.strToCharSeq()){
        println(i)
    }
}