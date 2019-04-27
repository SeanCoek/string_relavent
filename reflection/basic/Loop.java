package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class Loop extends BaseCase {


    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className;
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3"};
        for(int i=0; i<4; i++) {
            className = names[i];
            Logger.reportString(className, "Loop");     //expect result: "java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3"
            doReflect(className);
        }
    }
}
