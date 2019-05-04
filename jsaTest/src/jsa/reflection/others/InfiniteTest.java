package jsa.reflection.others;

import jsa.reflection.BaseCase;

public class InfiniteTest extends BaseCase {

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = "";
        for(int i=1; i < Integer.MAX_VALUE; i++) {
            className = className + ('x');
        }
        Class.forName(className);
    }
}