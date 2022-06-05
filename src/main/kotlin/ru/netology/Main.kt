package ru.netology


const val Minute = 60
const val Hour = 3600
const val Day = 86400
const val TWO_DAY = 172800
const val THREE_DAY = 259200


fun main() {
    agoToText(870)

}

fun agoToText (
    second: Int,

    ){
    when (second){
        in 0..Minute ->  println("был (а) в сети $second только что")

        in Minute + 1..Hour -> println("был (а) в сети  минут назад")

        in Hour + 1..Day  -> println("был (а) в сети  часов назад")

        in Day ..TWO_DAY  -> println("был (а) в сети  часов назад")

        in TWO_DAY ..THREE_DAY  -> println("был (а) в сети  часов назад")

        else -> println("в сети не появлялся")


    }


}

