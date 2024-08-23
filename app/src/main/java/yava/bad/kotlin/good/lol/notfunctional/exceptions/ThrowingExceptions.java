package yava.bad.kotlin.good.lol.notfunctional.exceptions;

import java.util.function.Function;

public class ThrowingExceptions {

    // let's assume that this is mandatory and not editable (comes from lib, framework, ...)
    public static class ExistingException extends Exception {

    }

    public static void main(String[] args) {
        // I just want to tell that something wrong happened
        Function<String, Integer> parse = (s) -> {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                // unhandled exception because Function does not throw checked exceptions
                // I must now declare my own Function<> just to be allowed to send the exception that I need
//                throw new ExistingException();
                return -1; // avoid compiler complains
            }
        };

        try {
            someFunctionWithCallback("xyz", parse);
        } catch (ExistingException e) {
            e.printStackTrace();
        }
    }

    public static int someFunctionWithCallback(String s, Function<String, Integer> f) throws ExistingException {
        // nope
        return f.apply(s);
    }
}
