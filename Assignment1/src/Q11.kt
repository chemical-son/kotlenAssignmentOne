class Q11 {//Right a kotlin Program to Reverse a Sentence Using Recursion.

    private var str: String

    constructor(str: String){
        this.str = str
    }

    private fun helper(localStr: String): String{
        if(localStr.length== 1)
            return localStr
        return localStr[localStr.length-1] + helper(localStr.substring(0, localStr.length-1))
    }

    fun reverseSentence(): String{
        return helper(str);
    }
}


fun main(){
    //take sentence form user.
    print("enter sentence: ")
    var str: String = readln()

    var obj: Q11 = Q11(str)

    println("the new sentence is: ${obj.reverseSentence()}")
}