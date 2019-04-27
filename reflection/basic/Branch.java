package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class Branch extends BaseCase {

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = null;
        if(Math.random() > 0.5) {
            className = "java.lang.Object";
        } else {
            className = "java.lang.Class";
        }
        Logger.reportString(className, "Branch");       // expect result: "java.lang.Object", "java.lang.Class"
        doReflect(className);
    }

}
