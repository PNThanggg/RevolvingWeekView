package revolving.week.lib.listener

interface DayTimeInterpreter {
    fun interpretDay(day: Int): String

    fun interpretTime(hour: Int, minutes: Int): String
}