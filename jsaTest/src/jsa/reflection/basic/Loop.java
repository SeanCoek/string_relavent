package jsa.reflection.basic;

import dk.brics.automaton.Automaton;
import jsa.reflection.BaseCase;

public class Loop extends BaseCase {


    public void test() throws ClassNotFoundException {
        String className = null;
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3",
                            "java.lang.Loop4", "java.lang.Loop5", "java.lang.Loop6"};
        for(int i=0; i<4; i++) {
            className = names[i];
        }
        Class.forName(className);
    }

}
