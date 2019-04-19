/*
Challenge: Apply Functional Programming for Simple Data Analysis

We decided to gather data on the age of our users.
In this challenge, you'll be presented with this partly faulty data
of user ages which is based on four input files:
*/

val data = mapOf(
    "users1.csv" to listOf(32, 45, 17, -1, 34),
    "users2.csv" to listOf(19, -1, 67, 22),
    "users3.csv" to listOf(),
    "users4.csv" to listOf(56, 32, 18, 44)
)

/*
Apply the functions you learned about as well as other functions from Kotlin's
standard library to solve the following data analysis tasks:
*/
fun main() {

    // 1.) //
    var avgAge=data.flatMap { it.value }
        .filter { it>0 }
        .average()
        println(avgAge)


    // 2.) //

    var badFormattedNames= mutableListOf<String>()
    for (each in data) if((each.value.filter { it<0 }.size)>0) badFormattedNames.add(each.key)
    println(badFormattedNames)


    // 3.) //

    val numOfbadFormattedNames=data.flatMap { it.value }
        .filter { it<0 }
        .size
        println(numOfbadFormattedNames)
}
/*
Hints: map() and flatMap() are often very useful functions for such tasks
Use IntelliJ's autocompletion to explore which other functions, that were not
presented in the lectures, are available (they could simplify the tasks)
 */