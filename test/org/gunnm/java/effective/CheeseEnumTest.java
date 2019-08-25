package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CheeseEnumTest {

    @Test
    public void test() {
        Assert.assertTrue(CheeseEnum.CABECOU.isSheep());
        Assert.assertTrue(CheeseEnum.COMTE.isCow());
        Assert.assertTrue(CheeseEnum.valueOf("COMTE").isCow());
    }
}