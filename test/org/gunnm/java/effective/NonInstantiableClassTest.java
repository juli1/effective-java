package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

public class NonInstantiableClassTest {

    @Test(expected = AssertionError.class)
    public void hasOneInstance() {
        NonInstantiableUtilsClass.createInstance();

    }
}