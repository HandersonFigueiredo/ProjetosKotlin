class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("leão"), Animal("jacaré"), Animal("cobra")))

    for (animal in zoo) {                                   // 3
        println("Cuidado, é um(a) ${animal.name}")
    }

}