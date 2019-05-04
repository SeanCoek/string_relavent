package jsa.reflection.others;

import jsa.reflection.BaseCase;

public class RecursiveTest extends BaseCase {

    public String recur(int deep) {

        if(deep > 0) {
            return recur(--deep) + "recur ";
        } else {
            return "recur ";
        }
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = recur(5);
        Class.forName(className);
    }
}
