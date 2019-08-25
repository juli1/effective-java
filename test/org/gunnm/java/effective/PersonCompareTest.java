package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PersonCompareTest {

    @Test
    public void testCompare() {
        PersonEquality p1 = new PersonEquality("mariah", 30);
        PersonEquality p2 = new PersonEquality("mariah", 30);
        PersonEquality p3 = new PersonEquality("jason", 10);

        Assert.assertEquals(p1.compareTo(p2),0);
        Assert.assertEquals(p1.compareTo(p2), -1 * p2.compareTo(p1));
    }
}