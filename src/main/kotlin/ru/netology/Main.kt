package ru.netology


const val Minute = 60
const val Hour = 3600
const val Day = 86400
const val TWO_DAY = 172800
const val THREE_DAY = 259200


fun main() {
    agoToText(3601)
}


fun agoToText (
    second: Int,

    ){
    when (second){
        in 0..Minute ->  println("был (а) в сети только что")

        in Minute + 1..Hour ->
        {
            val result = second/60
            when(result) {
                1, 21, 31, 41, 51 -> println("был (а) в сети $result минуту назад")
                2, 3, 4, 22, 23, 24, 32, 34, 42, 43, 44, 52, 53, 54 -> println("был (а) в сети $result минуты назад")
                else -> println("был (а) в сети $result минут назад")
            }
        }

        in Hour + 1..Day  ->
        {
            val result = second/3600
            when(result) {
                1, 21 -> println("был (а) в сети $result час назад")
                2, 3, 4, 22, 23 -> println("был (а) в сети $result часа назад")
                else -> println("был (а) в сети $result часов назад")
            }
        }
        in Day ..TWO_DAY  -> println("был (а) в сети  сегодня")

        in TWO_DAY ..THREE_DAY  -> println("был (а) в сети вчера")

        else -> println("был (а) в сети давно")
    }
}
