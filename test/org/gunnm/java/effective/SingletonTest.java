package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SingletonTest {

    @Test
    public void hasOneInstance() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Assert.assertEquals(s1, s2);
    }
}