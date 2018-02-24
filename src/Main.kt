import collections.*
import functions.User
import functions.saveUser
import inherits.*
import strings.*

fun main(args: Array<String>){
    checkUserValidateFunction()
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

fun checkStringLastChar(){
    println("abc".lastChar)
    println("abc".lastChar())
}

fun checkCollectionFunctionTo(){
    println("one" to 1)
}

fun checkParsePath(){
    val path = """C:\Program Files\Java\jdk\bin\java\jdk.jar"""
    println(path)
    println()

    println("StringParse")
    parsePathByString(path)
    println()

    println("RegexParse")
    parsePathByRegex(path)
}

fun checkUserValidateFunction(){
    val user1 = User(1, "Vasya", "")
    val user2 = User(2, "Petya", "SPB")
    val user3 = User(3, "", "Moscow")

    saveUser(user1)
    saveUser(user2)
    saveUser(user3)
}
