

fun main(args: Array<String>){
    nickNames("Sonia", "Sam", "Claudine", "Gregoire")
    citiesNames()
    intNumbers()
    println(pets("Max", "Kiki", "Boy"))
}



// function that takes in 4 strings, creates an array and prints it.

fun nickNames(name1: String, name2: String, name3: String, name4: String){
    var names = arrayOf(name1, name2, name3, name4)
    println(names.contentToString())
}

// function that prints out the names of the cities in the correct grammatical case.

fun citiesNames() {
     var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
     for(city in cities){
        println(city.capitalize())
    }
}

// function

fun intNumbers(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)

    // prints out the sum of the second and fifth elements
    var sum = numbers[1] + numbers[4]
    println(sum)

    // prints out the index of 158
    println(numbers.indexOf(158))

    // prints out the elements in ascending order
    var arr = numbers.sortedArray()
    println(arr.contentToString())
}


// function that takes in 3 names and returns a string array

fun pets(pet1: String, pet2: String, pet3: String): String {
    var petNames = arrayOf(pet1, pet2, pet3)
    return petNames.contentToString()

}
