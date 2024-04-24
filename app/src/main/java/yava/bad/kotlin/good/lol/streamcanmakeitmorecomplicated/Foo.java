///*
// *  Copyright (c) 2024 sovity GmbH
// *
// *  This program and the accompanying materials are made available under the
// *  terms of the Apache License, Version 2.0 which is available at
// *  https://www.apache.org/licenses/LICENSE-2.0
// *
// *  SPDX-License-Identifier: Apache-2.0
// *
// *  Contributors:
// *       sovity GmbH - initial API and implementation
// *
// */
//
//
//package yava.bad.kotlin.good.lol.streamcanmakeitmorecomplicated;
//
//import lombok.val;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Foo {
//    public static void main(String[] args) {
//
//        // For the sake of example, let's say we want to turn this into URL params
//        Map<String, List<String>> transferProcessProperties = Map.of(
//                "paramName1", List.of("a", "b", "c"),
//                "paramName2", List.of("10")
//        );
//
//        if (transferProcessProperties == null) {
//            return dataAddress;
//        }
//
//
//        HashMap<String, Object> combined = new HashMap<>(dataAddress.getProperties());
//
//        for (val property : transferProcessProperties.entrySet()) {
//            val workaroundProperty = MAPPINGS.get(property.getKey());
//            if (workaroundProperty != null) {
//                combined.put(workaroundProperty, property.getValue());
//            }
//        }
//
//        return DataAddress.Builder.newInstance()
//                .properties(combined)
//                .build();
//    }
//}
