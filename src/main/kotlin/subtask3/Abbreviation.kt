package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val isValid =
            Array(a.length + 1) { BooleanArray(b.length + 1) }
        isValid[0][0] = true
        var containsUppercase = false
        for (k in 1..a.length) {
            val i = k - 1
            if (a[i].toInt() <= 90 && a[i].toInt() >= 65 || containsUppercase) {
                containsUppercase = true
                isValid[k][0] = false
            } else isValid[k][0] = true
        }
        for (k in 1..a.length) {
            for (l in 1..b.length) {
                val i = k - 1
                val j = l - 1
                // when the characters are equal, set = previous character bool.
                if (a[i] == b[j]) {
                    isValid[k][l] = isValid[k - 1][l - 1]
                    continue
                } else if (a[i].toInt() - 32 == b[j].toInt()) {
                    isValid[k][l] = isValid[k - 1][l - 1] || isValid[k - 1][l]
                    continue
                } else if (a[i].toInt() <= 90 && a[i].toInt() >= 65) {
                    isValid[k][l] = false
                    continue
                } else {
                    isValid[k][l] = isValid[k - 1][l]
                    continue
                }
            }
        }
        return if (isValid[a.length][b.length]) "YES" else "NO"
    }
}
