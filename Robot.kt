import java.util.*

class Robot(var name: String, var day: Int) {

    fun alarm(time:String){
        if(day in Calendar.MONDAY..Calendar.SATURDAY){
            println("Wake up wake up it's a brand new day $time")
        }
        else{
            println("Enjoy it's sunday!!")
        }
    }
    open fun coffee(coff: Coffee){
        if(coff.normal){
        println("Your coffee with ${coff.sugar} spoons of sugar is ready.")
        }
        else{
            println("Your Black Coffee with ${coff.sugar} spoons of sugar is ready.")
        }
    }
    fun water(temp:Double){
        println("Your water is $temp degree fahrenheit boiled, Now go and take a bath!!")
    }
    fun bag(){
        val schedule = "Time table"
        val books = arrayOf("English","Hindi","Math","Physics","Chemistry","Computers")
        when(day){
            Calendar.MONDAY -> println("It's Monday your $schedule is ${books[1]},${books[3]},${books[5]}")
            Calendar.TUESDAY -> println("It's Tuesday your $schedule is ${books[0]},${books[2]},${books[4]}")
            Calendar.WEDNESDAY -> println("It's Wednesday your $schedule is ${books[1]},${books[3]},${books[5]}")
            Calendar.THURSDAY -> println("It's Thursday your $schedule is ${books[0]},${books[2]},${books[4]}")
            Calendar.FRIDAY -> println("It's Friday your $schedule is ${books[1]},${books[3]},${books[5]}")
            Calendar.SATURDAY -> println("It's Saturday your $schedule is ${books[0]},${books[2]},${books[4]}")
            Calendar.SUNDAY -> println("It's Sunday Enjoy!!")
        }
    }
    fun cooking(){
        val breakfast = mutableListOf("Milk and bread toast","Aloo paratha", "Boiled egg","Pancakes","Coffee and Sandwich")
        val lunch = mutableListOf("Rice and Dal","Kabab paratha","Biryani","Shahi Paneer","Tahri","I'm not making today","Korma naan")
        println("Food for breakfast is ${breakfast.random()} and for lunch ${lunch.random()}.")
    }
    fun iron(){
        val shirt = mutableListOf("Clean White","Jet Black","Beautiful Blue","Faded Gray","Baby Pink")
        val trouser = mutableListOf("Black","Blue","Light blue")
        println("Sir you clothes are ready I have selected ${shirt.random()} Shirt and ${trouser.random()} trouser for you Today.")
    }
}