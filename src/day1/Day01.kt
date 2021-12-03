import java.io.File

fun main() {

    var prev = Int.MAX_VALUE
    var increases = 0

    val testInput =
            File("/Users/tientran/IdeaProjects/advent-of-code-2021/src/day1/input.txt")
                    .forEachLine{
                        if(it.toInt() > prev)
                            increases++
                            prev = it.toInt();
                    }

    println(increases);
}
