fun main(args: Array<String>) {
    // ArrayLists (mutable) bisa diubah
    /*
    Metode:
    clear(), contains(), size, get() atau [], add() atau +=, remove() atau -=,
    removeAt(), toTypedArray(), lastIndexOf(), removeAll(), reverse()
    */
    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array: ")
    for(item in arrayList){
        print("$item ")
    }
    print("\n")
    arrayList += 9
    print("Tambahkan elemen 9 ke dalam arrayList: ")
    println(arrayList)
    arrayList.reverse()
    print("Balik arrayList: ")
    println(arrayList)
    arrayList -= 1 // Kita bisa menghapus!
    print("Hapus elemen terakhir di arrayList: ")
    println(arrayList)
    arrayList += (1..5)
    print("Tambahkan rentang ke dalam arrayList: ")
    println(arrayList)
}
