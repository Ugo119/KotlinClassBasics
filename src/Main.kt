/*
This project explores the concept of classes, constructor, accessors and mutators as well as
inittializer blocks.
 */

fun main() {
    var myDog = Dog("Scoobie", 15, "Rottweiller")
    println(myDog.bark())
    var myDogs = arrayOf(Dog("Billie", 25, "Mixed"), Dog("Timmie", 19, "Chiwauwua"),
        Dog("Scoobie", 35, "Rottweiller"))
    myDogs[1].weight = 32
    var secondDog = myDogs[1].name
    print("$secondDog backs like this: ")
    println(myDogs[1].bark())

    var myDogTwo = Dog("Leo", 40, "mastif")
    println(myDogTwo.bark())
    myDogTwo.weight = 89
    println(myDogTwo.weightInKgs)


}