package classes

class DeligatingCollection<T>(
        private val innerList: MutableList<T> = ArrayList()
): MutableList<T> by innerList {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerList.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerList.addAll(elements)
    }
}