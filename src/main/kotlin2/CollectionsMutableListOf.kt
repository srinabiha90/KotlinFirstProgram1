fun main(args: Array<String>) {
    // MutableList adalah List dengan operasi penulisan khusus list
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") // ini diperbolehkan

    //numbersStr = mutableListOf("six", "seven") // kesalahan kompilasi
    println(numbersStr)
}

