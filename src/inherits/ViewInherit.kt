package inherits

open class View {
    open fun click() = println("View clicked")
}

fun View.whoami() = println("Hello, I am View!")

class Button: View() {
    override fun click() = println("Button clicked")
}

fun Button.whoami() = println("Hello, I am Button!")
