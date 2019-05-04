package jsa.reflection.interprocedure;

import dk.brics.automaton.Automaton;
import jsa.reflection.BaseCase;

public class LoopInter extends BaseCase {
    public static String getClassName(int idx) {
        String className;
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3",
                            "java.lang.Loop4", "java.lang.Loop5", "java.lang.Loop6"};
        className = names[idx];
        return className;
    }

    public void test() throws ClassNotFoundException {
        String className = null;
        Automaton a = Automaton.makeEmpty();
        for(int i=0; i<4; i++) {
            className = getClassName(i);
            Class.forName(className);
        }
    }

}
