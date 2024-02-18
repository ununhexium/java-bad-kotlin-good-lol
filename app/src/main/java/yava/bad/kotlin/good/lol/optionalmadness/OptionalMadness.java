package yava.bad.kotlin.good.lol.optionalmadness;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class OptionalMadness {

    public static void main(String[] args) {
        // Note: the classes are in Java and the spec in lacking, so you're never sure whether a field in nullable and must always check in order not to crash.

        PackagedStuffWithLooongName response = callService();
        Optional<ActualDataThatYourReallyWanted> maybeSomethingInTheEnd = Optional.ofNullable(response)
                .map(PackagedStuffWithLooongName::getSubFieldAlsoWithALongName)
                .map(SubFieldAlsoWithALongName::getDetailConcerningSomethingImportant)
                .map(DetailConcerningSomethingImportant::getActualDataThatYourReallyWanted);
    }

    @NotNull
    private static PackagedStuffWithLooongName callService() {
        return new PackagedStuffWithLooongName(new SubFieldAlsoWithALongName(new DetailConcerningSomethingImportant(new ActualDataThatYourReallyWanted())));
    }
}
