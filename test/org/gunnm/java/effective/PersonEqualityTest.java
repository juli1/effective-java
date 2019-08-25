package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;

public class PersonEqualityTest {

    @Test
    public void testEquals() {
        PersonEquality p1 = new PersonEquality("mariah", 30);
        PersonEquality p2 = new PersonEquality("mariah", 30);
        PersonEquality p3 = new PersonEquality("jason", 10);
        Point p = new Point();

        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(p));
    }

    @Test
    public void testClone() {
        PersonEquality p1 = new PersonEquality("mariah", 30);
        PersonEquality p2 = p1.clone();

        Assert.assertTrue(p1 != p2);
        Assert.assertEquals(p1, p2);
    }
}