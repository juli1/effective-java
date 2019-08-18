package org.gunnm.java.effective;

import java.util.List;

public class Singleton {
    /**
     * We do not want the instance to be available outside.
     * it will be only accessible through getter.
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * Private consructor, nobody else can call it.
     */
    private Singleton() {
    }

    /**
     * Method to get the only existing instance
     * @return a [[Singleton]] instance
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
