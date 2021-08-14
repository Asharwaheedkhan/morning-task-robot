fun main(){
    val robot = Robot("Jarvis",2)
    println("Hi! How you doing? My name is ${robot.name}")
    robot.alarm("7:30 AM")
    robot.coffee(Coffee(true,1))
    robot.bag()
    robot.water(92.7)
    robot.cooking()
    robot.iron()
}