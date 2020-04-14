package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val days = arrayOf(
            "воскресенье",
            "понедельник",
            "вторник",
            "среда",
            "четверг",
            "пятница",
            "суббота"
        )
        val months = arrayOf(
            "января",
            "февраля",
            "марта",
            "апреля",
            "мая",
            "июня",
            "июля",
            "августа",
            "сентября",
            "октября",
            "ноября",
            "декабря"
        )
        val a: Int
        val y: Int
        val m: Int
        val R: Int
        val M = month.toInt()
        val Y = year.toInt()
        val D = day.toInt()
        val text: String
        if (D <= 0 || D > 31) {
            text = "Такого дня не существует"
            return text
        }
        if (Y % 4 != 0 && D > 28) {
            text = "Такого дня не существует"
            println(text)
            return text
        }
        if (M <= 0 || M > 12) {
            text = "Такого дня не существует"
            return text
        }
        a = (14 - M) / 12
        y = Y - a
        m = M + 12 * a - 2
        R = 7000 + (D + y + y / 4 - y / 100 + y / 400 + 31 * m / 12)
        text = day + " " + months[M - 1] + ", " + days[R % 7]
        println(text)
        return text
    }
}
