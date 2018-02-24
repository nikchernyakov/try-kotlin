package strings

fun parsePathByString(path: String) {
    val directory = path.substringBeforeLast("\\")
    val fullName = path.substringAfterLast("\\")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Directory: $directory")
    println("File name: $fileName")
    println("Extension: $extension")
}

fun parsePathByRegex(path: String) {
    val regex = """(.+)\\(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if(matchResult != null){
        val (directory, fileName, extension) = matchResult.destructured

        println("Directory: $directory")
        println("File name: $fileName")
        println("Extension: $extension")
    }

}
