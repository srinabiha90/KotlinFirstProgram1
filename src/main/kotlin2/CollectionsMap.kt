fun main(){
    // Map<K, V> bukan pewaris dari antarmuka Collection;
    /*
    Map menyimpan pasangan kunci-nilai (atau entri);
    kunci bersifat unik, tetapi kunci yang berbeda dapat dipasangkan dengan nilai yang sama.
    */
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("Semua kunci: ${numbersMap.keys}")
    println("Semua nilai: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Nilai dari kunci \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("Nilai 1 ada di dalam map")
    if (numbersMap.containsValue(1)) println("Nilai 1 ada di dalam map") // sama seperti sebelumnya

    // Dua map yang berisi pasangan yang sama dianggap sama, terlepas dari urutan pasangan.
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("Map-nya sama: ${numbersMap == anotherMap}")

    // MutableMap adalah Map dengan operasi penulisan, misalnya,
    // Anda dapat menambahkan pasangan kunci-nilai baru atau memperbarui nilai yang terkait dengan kunci yang diberikan
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // mencetak "1"
}
