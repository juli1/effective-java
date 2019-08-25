package org.gunnm.java.effective;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to show how equals and clone should be overriden.
 */
public class LambdaUse {

    public static void sortInverse(List<Integer> l) {
        Collections.sort(l, (t1, t2) -> t2.compareTo(t1));
    }


    public static List<Integer> removeHigherThan(List<Integer> l, Integer limit) {
        return l.stream().filter(i -> i <= limit).collect(Collectors.toList());
    }

}
