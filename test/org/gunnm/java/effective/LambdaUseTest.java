package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaUseTest {

    @Test
    public void testSortInverse() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        LambdaUse.sortInverse(l);
        Assert.assertEquals(l.get(0), Integer.valueOf(3));
    }

    @Test
    public void testEemoveHigherThan() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> res = LambdaUse.removeHigherThan(l, 5);
        Optional<Integer> o = res.stream().filter(i -> i <= 5).findAny();
        Assert.assertTrue(o.isPresent());
    }
}