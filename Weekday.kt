import java.util.*

enum class Weekday(val dayName: String, val color: Color)
{
    MONDAY("Понедельник", Color.RED),
    TUESDAY("Вторник", Color.ORANGE),
    WEDNESDAY("Среда", Color.YELLOW),
    THURSDAY("Четверг", Color.GREEN),
    FRIDAY("Пятница", Color.BLUE),
    SATURDAY("Суббота", Color.PURPLE),
    SUNDAY("Воскресенье", Color.PINK);
    fun displayInfo(): String
    {
        return "$dayName соответствует цвету ${color.russianName.lowercase()}"
    }
    fun getDayNumber(): Int
    {
        return ordinal + 1
    }
    fun isWeekend(): Boolean
    {
        return this == SATURDAY || this == SUNDAY
    }
    fun nextDay(): Weekday
    {
        val nextOrdinal = (ordinal + 1) % values().size
        return values()[nextOrdinal]
    }
}





