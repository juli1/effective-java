package org.gunnm.java.effective;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class to show how equals and clone should be overriden.
 */
public class PersonEquality implements Cloneable, Comparable<PersonEquality> {
    String name;
    int age;

    public PersonEquality(String n, int a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof PersonEquality == false) {
            return false;
        }
        PersonEquality other = (PersonEquality) o;

        return (other.name.equals(this.name) && other.age == this.age);
    }

    /**
     * Make sure that
     * cloned != this and close.equals(this)
     * @return
     */
    public PersonEquality clone() {
        return new PersonEquality(this.name, this.age);
    }

    @Override
    public int compareTo(PersonEquality other) {
        int ageDifference = Integer.compare(this.age, other.age);

        if (ageDifference != 0) {
            return ageDifference;
        }
        return this.name.compareTo(other.name);

    }
}
