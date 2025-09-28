fun main() {
    // Set<T> menyimpan elemen unik; urutannya umumnya tidak terdefinisi.
    val numbers = setOf(1, 2, 3, 4)
    println("Jumlah elemen: ${numbers.size}")
    if (numbers.contains(1)) println("1 ada di dalam set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("Set-set tersebut sama: ${numbers == numbersBackwards}")

    // Implementasi default dari Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
    val strings = hashSetOf("a", "b", "c", "c") // hash set nilai unik
    println("Nilai Set Saya adalah"+strings)
}
