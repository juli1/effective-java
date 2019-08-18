package org.gunnm.java.effective;

import java.util.Arrays;
import java.util.List;

/**
 * org.gunnm.java.effective.Pizza builder - a builder class to help you create pizza.
 * By default, set a default size and list of toppings. These
 * can be changed later as you build your org.gunnm.java.effective.Pizza with getters
 * and setters.
 */
public class PizzaBuilder {

    private int size;
    List<String> toppings;

    /**
     * Default attributes of the org.gunnm.java.effective.Pizza.
     */
    public static final List<String> DEFAULT_LIST_OF_TOPPINGS = Arrays.asList("cheese");
    public static final int DEFAULT_SIZE = 12;

    public PizzaBuilder() {
        this.size = DEFAULT_SIZE;
        this.toppings = DEFAULT_LIST_OF_TOPPINGS;
    }

    /**
     * Set the size of the pizza to build.
     * @param s
     * @return
     */
    public PizzaBuilder setSize(int s ) {
        this.size = s;
        return this;
    }

    /**
     * Set the list of toppings for the pizza to build.
     * @param p
     * @return
     */
    public PizzaBuilder setToppings(List<String> p) {
        this.toppings = p;
        return this;
    }

    public Pizza build() {
        return Pizza.createPizza(this.size, this.toppings);
    }

}

