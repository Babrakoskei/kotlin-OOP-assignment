fun main(){
    var student = Human("Babra",20,60.2)
    println(student.name)
    println(student.age)
    println(student.weight)
    println(student.eat(40))
    println(student.speak("I am a girl"))
    student.birthday()
    var person= User("Amelina","king","amelinaking@gmail.com",9839809,"amely")
    println(person.firstName)
    println(person.lastName)


   
}
data class Human(var name:String,var age:Int,var weight:Double){
   fun eat(foodWeight: Int):Double{
       println ("I am eating $foodWeight kgs of food")
       weight= foodWeight+weight
       return weight

   }
    fun speak(speech: String):String{
        return speech
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String){}

