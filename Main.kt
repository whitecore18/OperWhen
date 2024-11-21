import kotlin.math.roundToInt

fun main() {
    val monthNumber = 9
    val seasonAndMonth = when (monthNumber) {
        1 -> "Зима: Январь."
        2 -> "Зима: Февраль."
        3 -> "Весна: Март."
        4 -> "Весна: Апрель."
        5 -> "Весна: Май."
        6 -> "Лето: Июнь."
        7 -> "Лето: Июль."
        8 -> "Лето: Август."
        9 -> "Осень: Сентябрь."
        10 -> "Осень: Октябрь."
        11 -> "Осень: Ноябрь."
        12 -> "Зима: Декабрь."
        else -> "Некорректный номер месяца."
    }
    println(seasonAndMonth)

    val floatNumber = 2.1
    val roundedNumber = floatNumber.roundToInt()
    println("Округленное число: $roundedNumber")


    val hour = 13
    val timeOfDay = when (hour) {
        in 0..5 -> "Ночь"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..23 -> "Вечер"
        else -> "Некорректное время"
    }
    println("Время суток: $timeOfDay")

    var a = 8
    var b = 5

    // Обмен значениями переменных a и b с использованием побитового XOR
    a = a xor b // a становится 13 (в двоичном: 1000 xor 0101 = 1101)
    b = a xor b // b становится 8 (в двоичном: 1101 xor 0101 = 1000)
    a = a xor b // a становится 5 (в двоичном: 1101 xor 1000 = 0101)

    println("После обмена: a = $a, b = $b") // Вывод: a = 5, b = 8
}