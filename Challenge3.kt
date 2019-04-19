
class Robot (private var X: Int =0 , private var Y: Int = 0){

    fun goRight(steps :Int){X+=steps}
    fun goDown(steps :Int){Y+=steps}
    fun goLeft(steps :Int){X-=steps}
    fun goUp(steps :Int){Y-=steps}


    fun getLocation(): String { return "($X,$Y)"}
}



fun main() {

    val robot = Robot()
    println(robot.getLocation())
    robot.goRight(1)
    println(robot.getLocation())
    robot.goDown(2)
    println(robot.getLocation())
}
