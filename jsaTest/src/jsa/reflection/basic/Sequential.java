package jsa.reflection.basic;

import dk.brics.automaton.Automaton;
import jsa.reflection.BaseCase;

public class Sequential extends BaseCase {

    public void test() throws ClassNotFoundException {
        String className = "java.lang.Object1";

        className = "java.lang.Object2";

        Class.forName(className);
    }
}