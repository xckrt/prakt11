fun main()
{

    val понедельник = Weekday.MONDAY
    println(понедельник.displayInfo())
    println("Порядковый номер ${понедельник.dayName.toLowerCase()}: ${понедельник.getDayNumber()}")
    println("Является ли ${понедельник.dayName.toLowerCase()} выходным? ${понедельник.isWeekend()}")
    println("Следующий день после ${понедельник.dayName.lowercase()}: ${понедельник.nextDay()}")

    val helper = HelperFunctions()
    println("Введите число от 1 до 7")
    val ans = readLine()!!.toInt()
    helper.displayInfoByNumber(ans)
    println("Введите день недели")
    val ans1 = readLine().toString()
    helper.displayColorByName(ans1)
    println("Является ли ${понедельник.dayName.lowercase()} выходным? ${helper.isWeekend(понедельник)}")
    println("Следующий день после ${понедельник.dayName.lowercase()}: ${helper.getNextDay(понедельник)}")
}