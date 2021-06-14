package subtask1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        var result: String
        try {
            var chosenDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            var chosenDayOfWeek = when(chosenDate.dayOfWeek) {
                DayOfWeek.MONDAY -> "понедельник"
                DayOfWeek.TUESDAY -> "вторник"
                DayOfWeek.WEDNESDAY -> "среда"
                DayOfWeek.THURSDAY -> "четверг"
                DayOfWeek.FRIDAY -> "пятница"
                DayOfWeek.SATURDAY -> "суббота"
                DayOfWeek.SUNDAY -> "воскресенье"
            }
            var chosenMonth = when(chosenDate.month) {
                Month.JANUARY -> "января"
                Month.FEBRUARY -> "февраля"
                Month.MARCH -> "марта"
                Month.APRIL -> "апреля"
                Month.MAY -> "мая"
                Month.JUNE -> "июня"
                Month.JULY -> "июля"
                Month.AUGUST -> "августа"
                Month.SEPTEMBER -> "сентября"
                Month.OCTOBER -> "октября"
                Month.NOVEMBER -> "ноября"
                Month.DECEMBER -> "декабря"
            }

            result = "$day $chosenMonth, $chosenDayOfWeek"
        } catch (e: Exception) {
            result = "Такого дня не существует"
        }

        return result
    }
}
