fun main(){
println(words(listOf("Catherine","John","Victorine","Favour","Joel","Hezborn","Elizabeth","Amani","Adeke","Omondi","Imaa") as MutableList<String>))
    println(tall(listOf(1.3,1.5,1.6,1.7,1.8,1.2,1.7)))
    println(order(listOf(Person("Victorine Amani",20,1.3,75.3),
                         Person("Joel john",9,1.0,27.5),
                         Person("Favour Kimori",11,1.1,35.7))))
    println(more(listOf(Person("Hezborn Omondi",42,1.7,70.7),
                        Person("Elizabeth Imaa",38,1.5,88.5))))
    println(average(listOf(Car("KXX123X",20.45),
                           Car("KTN774T",23.73),
                           Car("KXN3445Z",22.71))))
}
fun words(names:MutableList<String>): List<String> {
    var names= names.filter{ name->names.indexOf(name)%2==0}
    return names
}
data class Tall(var average:Double,var total:Double)
fun tall(heights: List<Double>): Tall {
    var average=heights.average()
   var total=heights.sum()
    var newHeights=Tall(average,total)
    return newHeights
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun order(person:List<Person>){
    val descendingSortedPerson = person.sortedByDescending { person -> person.age }
    println(descendingSortedPerson)
}
fun more(person:List<Person>):List<Any> {
    val human= mutableListOf(person)
     return human
}
data class Car(var registration:String,var mileage:Double)
fun average(car:List<Car>):Double{
    val averageMileage=car.map{car->car.mileage}.average()
    return averageMileage
}

