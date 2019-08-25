package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TryWithResourcesTest {

    @Test
    public void testThrowException() {
        boolean exceptionCaught = false;
        try{
            TryWithResources.readFileThrowException("foobar");
        } catch(IOException e) {
            exceptionCaught = true;
        }
        Assert.assertTrue(exceptionCaught);
    }

    @Test
    public void testWithoutException() {
        Assert.assertEquals(TryWithResources.readFile("foobar"), null);
    }
}