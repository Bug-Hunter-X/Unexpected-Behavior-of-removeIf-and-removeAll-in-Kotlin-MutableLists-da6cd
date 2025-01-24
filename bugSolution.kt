fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.toMutableList().removeIf { it > 2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val list2 = mutableListOf(1,2,3,4,5)
    val newList2 = list2.toMutableList().removeAll { it > 2 }
    println(list2) // Output: [1, 2, 3, 4, 5]
    println(newList2) // Output: [1, 2]
} 