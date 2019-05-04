package reflection.interprocedure;

import reflection.BaseCase;
import LoggerLib.Logger;

public class LoopInter extends BaseCase {
    public String getClassName(int idx) {
        String className;
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3",
                            "java.lang.Loop4", "java.lang.Loop5", "java.lang.Loop6"};
        className = names[idx];
        return className;
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = null;
        for(int i=0; i<4; i++) {
            className = getClassName(i);
            Logger.reportString(className, "LoopInter");
            doReflect(className);
        }
    }

}
