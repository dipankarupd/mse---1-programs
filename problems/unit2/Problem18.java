package com.raj.problems.unit2;

/*
Demonstrates a program that illustrates inheritance of interfaces. Interface I1 is
extended by I2 and I3. Interface P inherits from both I2 and I3. Each interface
declares one constant and one method. class Q implements P interface. Instantiate
Q and invoke each of its methods. Each method displays one of the constants
 */

interface I1 {
    static final int VAL1 = 20;
    void meth();
}

interface I2 extends I1 {
    int VAL2 = 30;
    void meth2();
}

interface I3 extends I1 {
    int VAL3 = 40;
    void meth3();
}

interface P extends I2,I3 {
    int VAL4 = 50;
    void meth4();
}

class Q implements P {

    // overriding the methods:

    @Override
    public void meth() {
        System.out.println(VAL1);
    }

    @Override
    public void meth2() {
            System.out.println(VAL2);
    }

    @Override
    public void meth3() {
        System.out.println(VAL3);
    }

    @Override
    public void meth4() {
        System.out.println(VAL4);
    }
}

public class Problem18 {
    public static void main(String[] args) {

        // creating the object:

        Q obj = new Q();
        obj.meth();
        obj.meth2();
        obj.meth3();
        obj.meth4();


    }
}
