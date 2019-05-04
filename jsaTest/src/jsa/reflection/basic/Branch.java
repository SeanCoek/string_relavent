package jsa.reflection.basic;

import jsa.reflection.BaseCase;

public class Branch extends BaseCase {

    public void test() throws ClassNotFoundException {
        int i = (int)(Math.random() * 10);
        String className = null;
        if(i > 5) {
            className = "java.lang.Object";
        } else {
            className = "java.lang.Class";
        }
        Class.forName(className);
    }

}
