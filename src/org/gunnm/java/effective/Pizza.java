package org.gunnm.java.effective;

import java.util.List;

public class Pizza {
    final private int size;
    final List<String> toppings;

    /**
     * Private constructor, do not expose constructor to anybody (better not).
     * @param s
     * @param toppings
     */
    private Pizza(int s, List<String> toppings) {
        this.size = s;
        this.toppings = toppings;
    }

    /**
     * Create a pizza with a spepcified size and list of toppings.
     * @param s - the size of the org.gunnm.java.effective.Pizza
     * @param t - the list of toppings
     * @return
     */
    public static Pizza createPizza(int s, List<String> t) {
        return new Pizza(s, t);
    }


    public List<String> getToppings() {
        return this.toppings;
    }

    public int getSize() {
        return this.size;
    }
}
