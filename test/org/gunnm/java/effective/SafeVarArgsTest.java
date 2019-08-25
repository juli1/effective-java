package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgsTest {

    @Test
    public void test() {
        List<String> c = SafeVarArgs.combineAllLists(Arrays.asList("bla", "bli"), Arrays.asList("blo", "bloublou"));
        Assert.assertEquals(c.size(), 4);
    }
}