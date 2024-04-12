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


package yava.bad.kotlin.good.lol.lombokcantdoitsjob;

import lombok.val;

import java.util.List;
import java.util.Map;

public class Foo {
    public static void main(String[] args) {
        // this is what we want
        // List<Map<String,List<String>>
        val ex1 = List.of(
                Map.<String, List<String>>of(),
                Map.of(
                        "limit", List.of("10"),
                        "filter", List.of("a", "b", "c")
                )
        );

        // lombok is lost
        // List<Map<? extends Object, ? extends Object>>
        val ex2 = List.of(
                Map.of(),
                Map.of(
                        "limit", List.of("10"),
                        "filter", List.of("a", "b", "c")
                )
        );

        // the java compiler too
        // List<Map<? extends Object, ? extends Object>>
        var ex4 = List.of(
                Map.of(),
                Map.of(
                        "limit", List.of("10"),
                        "filter", List.of("a", "b", "c")
                )
        );


        // And this breaks completely because of the untyped map
//        Map<String, List<String>> ex3 = List.of(
//                Map.of(),
//                Map.of(
//                        "limit", List.of("10"),
//                        "filter", List.of("a", "b", "c")
//                )
//        );
    }
}
