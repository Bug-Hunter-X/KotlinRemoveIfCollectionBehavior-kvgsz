//This file demonstrates the expected behavior of removeIf for different collection types. 
//The behavior on lists and sets is quite intuitive, elements are removed based on the predicate.
//However, the behavior of removeIf on maps is a bit different. It iterates over the entries of the map (key-value pairs). 
//If the predicate is true for a particular entry, that entire entry is removed from the map.
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d", 5 to "e")
    map.removeIf { it.key > 2 }
    println(map) // Output: {1=a, 2=b}
}
