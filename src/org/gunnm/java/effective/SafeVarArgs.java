package org.gunnm.java.effective;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgs {

    @SafeVarargs
    public static<E> List<E> combineAllLists(List<E>... lists) {
        List<E> finalList = new ArrayList<E>();
        for(List<E> tmp: lists) {
            finalList.addAll(tmp);
        }
        return finalList;
    }
}
