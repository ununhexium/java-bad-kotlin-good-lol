package yava.bad.kotlin.good.lol.optionalmadness

import java.util.*

object OptionalMadnessButShorter {
    @JvmStatic
    fun main(args: Array<String>) {
        val response = callService()
        val maybeSomethingInTheEnd = response.subFieldAlsoWithALongName
            ?.detailConcerningSomethingImportant
            ?.actualDataThatYourReallyWanted
    }

    private fun callService() =
        PackagedStuffWithLooongName(
            SubFieldAlsoWithALongName(
                DetailConcerningSomethingImportant(
                    ActualDataThatYourReallyWanted()
                )
            )
        )
}
