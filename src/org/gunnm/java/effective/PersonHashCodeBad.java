package org.gunnm.java.effective;


public class PersonHashCodeBad extends PersonEquality{

    public PersonHashCodeBad(String n, int a) {
        super(n, a);
    }

    @Override
    public int hashCode() {
        return 51;
    }
}
