import collections.joinToString
import inherits.Button
import inherits.View
import inherits.whoami

fun main(args: Array<String>){
    // checkJoinToString()
    checkViewInherit()
}

fun checkJoinToString(){
    val list = listOf(1, 2, 3)
    print(list.joinToString())
}

fun checkViewInherit(){
    val view : View = Button()
    view.click()
    view.whoami()
}