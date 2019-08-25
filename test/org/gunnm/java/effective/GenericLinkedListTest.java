package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GenericLinkedListTest extends HashCodeCommon {

    @Test
    public void test() {
        GenericLinkedList<String> s = new GenericLinkedList<>("bla", new GenericLinkedList<String>("bli"));
        Iterator<String> it = s.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(it.next(), "bla");
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(it.next(), "bli");
        Assert.assertFalse(it.hasNext());
    }
}