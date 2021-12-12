package day3

import java.io.File

class Day03 {

    var bitList = ArrayList<CommonBits>()

    val testInput =
            File("/Users/tientran/IdeaProjects/advent-of-code-2021/src/day3/input.txt")
                    .forEachLine{
                        it.forEach {

                        }
                    }

}

data class CommonBits(var numZeros: Int, var numOnes: Int);