class Q4 {//Right a Kotlin Program to Check if An Array Contains a Given Value
    private var number: Array<Double>
    private var search: Double = 0.0

    constructor(number: Array<Double>, search: Double){
        this.number = number
        this.search = search
    }
    fun searchForSpecificValue(): Int{
        return return number.indexOf(search)
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

    print("enter searched element: ")
    var search: Double = readln().toDouble()
    var obj: Q4 = Q4(num, search)

    var res = obj.searchForSpecificValue()
    if(res == -1)
        println("this element is not found")
    else
        println("this element is at index $res")
}