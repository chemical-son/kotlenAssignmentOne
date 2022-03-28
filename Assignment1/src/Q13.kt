//Right a kotlin program to check Whether a Character is Alphabet or Not.

fun isLetters(char: String): Boolean {
    if (char[0] !in 'A'..'Z' && char[0] !in 'a'..'z') {
        return false
    }
    return true
}

fun main(){
    println("we check first character only from your input")
    print("enter your single input: ")
    var char = readln()
    if (isLetters(char))
        println("is a character")
    else
        println("is not a character")
}