fun main() {

    for(i in 0..3) {             // 1... inclusive
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2... exclusivo
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3... incrementos de 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4... decrementar até zero
        print(i)
    }
    print(" ")


}