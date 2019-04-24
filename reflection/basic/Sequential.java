package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class Sequential extends BaseCase {

    public String getClassName1() {
        String className = "java.lang.Object1";
        return className;
    }

    public String getClassName2() {
        return "java.lang.Object2";
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName1();
        Logger.reportString(className, "Sequential1");      // expect result: "java.lang.Object1"
        doReflect(className);

        className = getClassName2();
        Logger.reportString(className, "Sequential12");     // expect result: "java.lang.Object2"
        doReflect(className);
    }
}