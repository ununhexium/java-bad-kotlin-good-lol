/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       sovity GmbH - initial API and implementation
 *
 */


package yava.bad.kotlin.good.lol.supplierofimplementingoptionofimplementingt;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var stuff = Optional.<String>ofNullable(null /* or "maybe stuff" */);
        var orElse = Optional.of("other stuff");

        // Go check or's definition
        //
        // public Optional<T> or(@NotNull Supplier<? extends Optional<? extends T>> supplier) {
        //
        // >_<"!!
        // Note: @NotNull not in the original code but it's checked on the first line and could be in the function's definition to help the dev.
        //
        // That is barely readable
        // Also how TF do you get something that extends Optional when Optional is a final class (without fiddling with introspection or bytecode manipulation, which can bypass this check anyway)
        // https://stackoverflow.com/questions/22734660/why-is-optionalt-declared-as-a-final-class
        var result = stuff.or(() -> orElse);
    }
}
