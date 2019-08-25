package org.gunnm.java.effective;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashCodeCommon {
    public static final int NB_INSTANCES = 100_000;
    Random rand = new Random();

    public String generateName(){
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < 10 ; i++) {
            sb.append(Character.valueOf((char) rand.nextInt(200)));
        }
        return sb.toString();
    }
}