import collections.joinToString

fun main(args: Array<String>){
    checkJoinToString()
}

fun checkJoinToString(){
    val list = listOf(1, 2, 3)
    print(list.joinToString())
}
