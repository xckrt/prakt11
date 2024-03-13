class HelperFunctions
{
    fun displayInfoByNumber(number: Int)
    {
        val day = Weekday.values().getOrNull(number - 1)
        if (day != null)
        {
            println(day.displayInfo())
        }
        else
        {
            println("Неверный номер дня")
        }
    }
    fun displayColorByName(dayName: String)
    {
        val day = Weekday.values().find { it.dayName.equals(dayName, ignoreCase = true) }
        if (day != null)
        {
            println("${day.dayName} соответствует цвету ${day.color.russianName}")
        }
        else
        {
            println("Неверное название дня")
        }
    }
    fun isWeekend(day: Weekday): Boolean
    {
        return day.isWeekend()
    }
    fun getNextDay(day: Weekday): Weekday
    {
        return day.nextDay()
    }
}


