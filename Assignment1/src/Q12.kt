class Q12 {//Right a Kotlin Program to sort an array in ascending order.

    private var data: ArrayList<Int>

    constructor(data: ArrayList<Int>){
        this.data = data
    }

    fun sort(): ArrayList<Int>{
        var localArr: ArrayList<Int> = data
        for (i in 0 until localArr.size-1){
            for(j in i+1 until localArr.size){
                if (localArr[i] > localArr[j]){
                    localArr[i] = localArr[j].apply { localArr[j] = localArr[i] }
                }
            }
        }
        return localArr
    }
}


fun main(){
    //take base and power noms.
    var flag = true
    var list: ArrayList<Int>
    var sizeOfList: Int = 0

    do {
        try {
            print("enter size of Array: ")
            sizeOfList = readln().toInt()
            flag = false
        }
        catch (e: NumberFormatException){
            println("you should enter Integer number")
        }
    }while (flag)

    list = ArrayList(sizeOfList)

    for (i in 0 until sizeOfList){
        flag = true
        do {
            try {
                print("enter num ${i+1}: ")
                list.add(readln().toInt())
                flag = false
            }
            catch (e: NumberFormatException){
                println("you should enter number")
            }
        }while (flag)

    }
    var obj: Q12 = Q12(list)

    println("the new sorted list\n ${obj.sort()}")
}