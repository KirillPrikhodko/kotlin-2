fun sortListUsingSortedBy(numbers: List<Int>) {
    val sortedList = numbers.sortedBy { it }
    println(sortedList)
}

fun bubbleSort(numbers: MutableList<Int>) {
    val n = numbers.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    println(numbers)
}

fun main() {
    val numbers = mutableListOf<Int>()
    println("Enter numbers to sort (separated by spaces):")
    readLine()?.split(" ")?.forEach { numbers.add(it.toInt()) }

    sortListUsingSortedBy(numbers)

    val numbersBubbleSort = numbers.toMutableList()
    bubbleSort(numbersBubbleSort)
}