package org.gunnm.java.effective;


public class PersonHashCodeGood extends PersonEquality{

    public PersonHashCodeGood(String n, int a) {
        super(n, a);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * 31 + this.age * 31 * 31;
    }
}
