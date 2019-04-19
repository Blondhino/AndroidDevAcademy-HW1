import kotlin.random.Random

fun main() {

    val collectionOfIntegers = mutableListOf<Int>()

    for (i in 1..100) collectionOfIntegers.add(Random.nextInt(1,10))
    for (i in 0..99)  if (collectionOfIntegers[i]<=10) print(collectionOfIntegers[i])

}