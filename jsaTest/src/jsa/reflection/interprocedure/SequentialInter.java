package jsa.reflection.interprocedure;

import dk.brics.automaton.Automaton;
import jsa.reflection.BaseCase;

public class SequentialInter extends BaseCase {
    public static String getClassName1() {
        return "java.lang.Object1";
    }

    public static String getClassName2() {
        return "java.lang.Object2";
    }

    public void test() throws ClassNotFoundException {
        String className = getClassName1();
        className = getClassName2();
        Class.forName(className);
    }
}
