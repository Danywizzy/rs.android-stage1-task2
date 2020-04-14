package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val numberWords = arrayOf(
            "", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
            "twenty three", "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine"
        )
        val hour1: Int = hour.toInt();
        val minute1: Int = minute.toInt();
        var text: String = "";

        val nextHour = hour1 % 12 + 1

        when {
            minute1 > 60 ->{
                text = ""
            }
            minute1 == 0 -> {
                text = numberWords[hour1] + " o' clock"
            }
            minute1 == 15 -> {
                text = "quarter past " + numberWords[hour1]
            }
            minute1 == 30 -> {
                text = "half past " + numberWords[hour1]
            }
            minute1 == 45 -> {
                text = "quarter to " + numberWords[nextHour]
            }
            minute1 < 30 -> {
                text = numberWords[minute1] + " minutes past " + numberWords[hour1]
            }
            else -> {
                text = numberWords[60 - minute1] + " minutes to " +numberWords[nextHour]
            }
        }
        return text
    }
}
