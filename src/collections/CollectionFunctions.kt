package collections

const val DEFAULT_SEPARATOR = ", "
const val DEFAULT_PREFIX = "["
const val DEFAULT_POSTFIX = "]"

fun <T> Collection<T>.joinToString(
        separator: String = DEFAULT_SEPARATOR,
        prefix : String = DEFAULT_PREFIX,
        postfix : String = DEFAULT_POSTFIX
    ): String{

    val stringBuilder = StringBuilder(prefix)

    forEachIndexed { index, element -> stringBuilder
                .append(if (index > 0) separator else "") // Don't append separator before first element
                .append(element) }

    stringBuilder.append(postfix)

    return stringBuilder.toString()
}