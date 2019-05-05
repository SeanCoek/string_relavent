package reflection.interprocedure;

import reflection.BaseCase;
import LoggerLib.Logger;

public class SequentialInter extends BaseCase {
    public String getClassName1() {
        return "java.lang.Object1";
    }

    public String getClassName2() {
        return "java.lang.Object2";
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName1();
        Logger.reportString(className, "SequentialInter1");      // expect result: "java.lang.Object1"
        doReflect(className);

        className = getClassName2();
        Logger.reportString(className, "SequentialInter2");     // expect result: "java.lang.Object2"
        doReflect(className);
    }

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        SequentialInter s = new SequentialInter();
        s.test();
    }
}
