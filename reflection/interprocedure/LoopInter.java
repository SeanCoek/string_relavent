package reflection.interprocedure;

import reflection.BaseCase;
import LoggerLib.Logger;

public class LoopInter extends BaseCase {
    public String getClassName(int idx) {
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3"};
        return names[idx];
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = null;
        for(int i=0; i<4; i++) {
            className = getClassName(i);
            Logger.reportString(className, "LoopInter");     //expect result: "java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3"
            doReflect(className);
        }
    }
}
