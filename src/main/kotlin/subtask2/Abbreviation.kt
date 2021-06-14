package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        println(a)
        println(b)
        var strA = a.toLowerCase()
        var strB = b.toLowerCase()

        var p = 0
        var isPossible = false
        for (ch in strB) {
            isPossible = false
            for (i in p until strA.length) {
                if (strA[i] == ch) {
                    p = i
                    isPossible = true
                    break
                }
            }
        }
        return if (isPossible) "YES" else "NO"
    }
}
