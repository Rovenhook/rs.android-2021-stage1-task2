package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        if (blockB == String::class) {
            var result = ""
            for (a in blockA) {
                if (a != null && a::class == String::class) {
                    result += a.toString()
                }
            }
            return result
        } else if (blockB == Int::class) {
            var result = 0
            for (a in blockA) {
                if (a != null && a::class == Int::class) {
                    result += (a as Int)
                }
            }
            return result
        } else {
            var result: LocalDate = LocalDate.of(1, 1, 1)
            for (a in blockA) {
                if (a is LocalDate) {
                    if (a > result) result = a
                }
            }
            return "${result.dayOfMonth}.${result.monthValue}.${result.year}"
        }
    }
}
