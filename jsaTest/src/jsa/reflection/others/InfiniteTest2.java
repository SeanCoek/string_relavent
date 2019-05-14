package jsa.reflection.others;

import jsa.reflection.BaseCase;

public class InfiniteTest2 extends BaseCase {

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = "";
        for(int i=1; i < Integer.MAX_VALUE; i++) {
            className = className + ('x'+ String.valueOf(i));
        }
        Class.forName(className);
    }
}