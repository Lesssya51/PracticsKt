//Известны два расстояния: одно в километрах, другое — в футах ( 1 фут
//0,305 м ). Какое из расстояний меньше?
fun main(){
    println("Введите расстояние в километрах:")
    val distanceKm = readLine()!!.toDouble()

    println("Введите расстояние в футах:")
    val distanceFeet = readLine()!!.toDouble()

    val feetToMeters = distanceFeet * 0.305
    val feetToKm = feetToMeters / 1000

    if (distanceKm < feetToKm) {
        println("Меньшее расстояние в километрах: $distanceKm км")
    } else if (feetToKm < distanceKm) {
        println("Меньшее расстояние в футах: $distanceFeet футов (примерно $feetToKm км)")
    } else {
        println("Расстояния равны: $distanceKm км = $distanceFeet футов (примерно $feetToKm км)")
    }
}