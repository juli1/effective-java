package org.gunnm.java.effective;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PizzaBuilderTest {

    @Test
    public void buildDefaultPizza() {
        Pizza p = new PizzaBuilder().build();
        Assert.assertEquals(p.getSize(), PizzaBuilder.DEFAULT_SIZE);
        Assert.assertEquals(p.getToppings(), PizzaBuilder.DEFAULT_LIST_OF_TOPPINGS);
    }

    @Test
    public void buildCustomPizza() {
        Pizza p = new PizzaBuilder().setSize(51).setToppings(Arrays.asList("cheeze", "olives")).build();
        Assert.assertEquals(p.getToppings().size(), 2);
        Assert.assertEquals(p.getSize(), 51);
    }
}