package yava.bad.kotlin.good.lol.optionalmadness

import java.util.*


fun main(args: Array<String>) {
    val response = callService()
    val maybeSomethingInTheEnd = response.subFieldAlsoWithALongName
        ?.detailConcerningSomethingImportant
        ?.actualDataThatYourReallyWanted
}

