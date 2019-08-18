package org.gunnm.java.effective;

public class NonInstantiableUtilsClass {
    public static final int MYCONSTANT = 1;

    /**
     * We make it private so that nobody can instantiate the class.
     * Below, we reproduce the case somebody still modified the class
     * to allow its instantiation.
     */
    private NonInstantiableUtilsClass() {
        throw new AssertionError();
    }

    /**
     * Test to instantiate the class. Do not do this, this
     * is just an example of what a human mistake and stupid
     * coding error would look like.
     * @return
     */
    public static NonInstantiableUtilsClass createInstance() {
        return new NonInstantiableUtilsClass();
    }
}
