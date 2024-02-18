package yava.bad.kotlin.good.lol.optionalmadness

data class PackagedStuffWithLooongName(val subFieldAlsoWithALongName: SubFieldAlsoWithALongName?)

data class SubFieldAlsoWithALongName(val detailConcerningSomethingImportant: DetailConcerningSomethingImportant?)

data class DetailConcerningSomethingImportant(val actualDataThatYourReallyWanted: ActualDataThatYourReallyWanted?)

class ActualDataThatYourReallyWanted
