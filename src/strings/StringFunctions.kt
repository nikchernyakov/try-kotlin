package strings

val String.lastChar: Char
    get() = get(length - 1)

fun String.lastChar(): Char = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }
