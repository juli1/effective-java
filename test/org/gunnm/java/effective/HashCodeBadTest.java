package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.*;

public class HashCodeBadTest extends HashCodeCommon {

    @Test
    public void test() {
        Map<String, PersonHashCodeBad> map = new HashMap(NB_INSTANCES);
        Set<String> names = new HashSet<String>();
        int bla = 0;
        for (int i = 0 ; i < NB_INSTANCES ; i++){
            String s = generateName();
            names.add(s);
            map.put(s, new PersonHashCodeBad(s, rand.nextInt(100)));
        }

        for(String n: names){
            PersonEquality p = map.get(n);
            bla = p.age;
       }
        System.out.println(bla);
    }
}