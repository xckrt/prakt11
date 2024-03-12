fun main()
{
    // Пример использования классов и методов
    val понедельник = Weekday.ПОНЕДЕЛЬНИК
    println(понедельник.displayInfo())
    println("Порядковый номер ${понедельник.dayName.toLowerCase()}: ${понедельник.getDayNumber()}")
    println("Является ли ${понедельник.dayName.toLowerCase()} выходным? ${понедельник.isWeekend()}")
    println("Следующий день после ${понедельник.dayName.toLowerCase()}: ${понедельник.nextDay()}")

    val helper = HelperFunctions()
    helper.displayInfoByNumber(3) // Вывод информации о третьем дне недели
    helper.displayColorByName("Пятница") // Вывод цвета по названию дня недели
    println("Является ли ${понедельник.dayName.toLowerCase()} выходным? ${helper.isWeekend(понедельник)}")
    println("Следующий день после ${понедельник.dayName.toLowerCase()}: ${helper.getNextDay(понедельник)}")
}