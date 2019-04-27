package reflection.interprocedure;

import reflection.BaseCase;
import LoggerLib.Logger;

public class BranchInter extends BaseCase {
    public String getClassName() {
        String className = null;
        if(Math.random() > 0.5) {
            className = "java.lang.Object";
        } else {
            className = "java.lang.Class";
        }
        return className;
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName();
        Logger.reportString(className, "BranchInter");       // expect result: "java.lang.Object", "java.lang.Class"
        doReflect(className);
    }
}
