package jsa.reflection.interprocedure;

import jsa.reflection.BaseCase;

public class BranchInter extends BaseCase {
    public static String getClassName1() {
        return "java.lang.Class";
    }
    public static String getClassName2() {
        return "java.lang.Object";
    }

    public void test() throws ClassNotFoundException {

        String className = null;
        if (Math.random()*10 > 5) {
            className = getClassName1();
        } else {
            className = getClassName2();
        }

        Class.forName(className);

    }
}
