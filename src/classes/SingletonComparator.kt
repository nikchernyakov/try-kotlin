package classes

import java.io.File

object FileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File) = file1.path.compareTo(file2.path)
}
