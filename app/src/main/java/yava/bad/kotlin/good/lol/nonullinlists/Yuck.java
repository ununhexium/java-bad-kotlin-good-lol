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


package yava.bad.kotlin.good.lol.nonullinlists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Yuck {
    public static void main(String[] args) {
        try {
            List<Integer> throwsNullPointerException = List.of(1, null);
        } catch (NullPointerException e) {
            System.out.println("Nice NPE!");
        }

        List<Integer> nullsAreOk = Arrays.asList(1, null);

        // complains that there's only 1 argument
        List<Integer> okButItWillComplain = Arrays.asList((Integer) null);

        // Confusing argument 'null', unclear if a varargs or non-varargs call is desired
        try {
            var nowItsLost = Arrays.asList(null);
        } catch (NullPointerException e) {
            System.out.println("Nice NPE 2!");
        }

        List<Integer> fineIllJustUseSingletonList = Collections.singletonList((Integer) null);

        System.out.println(nullsAreOk);
        System.out.println(okButItWillComplain);
        System.out.println(fineIllJustUseSingletonList);
    }
}
