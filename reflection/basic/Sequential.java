package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class Sequential extends BaseCase {

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = "java.lang.Object1";
        Logger.reportString(className, "Sequential1");      // expect result: "java.lang.Object1"
        doReflect(className);

        className = "java.lang.Object2";
        Logger.reportString(className, "Sequential12");     // expect result: "java.lang.Object2"
        doReflect(className);
    }
}