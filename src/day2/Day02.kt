package day2

import java.io.File

fun main() {

    var horizontalPos = 0;
    var depth = 0;

    val testInput =
            File("/Users/tientran/IdeaProjects/advent-of-code-2021/src/day2/input.txt")
                    .forEachLine{
                        var lineSplitStr = it.split(' ')
                        var command = lineSplitStr.get(0)
                        var commandValue = lineSplitStr.get(1).toInt()

                        when(command){
                            "forward" -> { horizontalPos += commandValue }
                            "down" -> { depth += commandValue }
                            "up" -> { depth -= commandValue }
                        }
                    }

    println("Depth: " + depth)
    println("Horizontal: " + horizontalPos)
    println("Depth X Horizontal: " + depth * horizontalPos);

}