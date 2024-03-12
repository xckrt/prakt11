enum class Weekday(val dayName: String, val color: Color)
{
    ПОНЕДЕЛЬНИК("Понедельник", Color.RED),
    ВТОРНИК("Вторник", Color.ORANGE),
    СРЕДА("Среда", Color.YELLOW),
    ЧЕТВЕРГ("Четверг", Color.GREEN),
    ПЯТНИЦА("Пятница", Color.BLUE),
    СУББОТА("Суббота", Color.PURPLE),
    ВОСКРЕСЕНЬЕ("Воскресенье", Color.PINK);
    fun displayInfo(): String
    {
        return "$dayName соответствует цвету ${color.russianName.toLowerCase()}"
    }
    fun getDayNumber(): Int
    {
        return ordinal + 1
    }
    fun isWeekend(): Boolean
    {
        return this == СУББОТА || this == ВОСКРЕСЕНЬЕ
    }
    fun nextDay(): Weekday
    {
        val nextOrdinal = (ordinal + 1) % values().size
        return values()[nextOrdinal]
    }
}





