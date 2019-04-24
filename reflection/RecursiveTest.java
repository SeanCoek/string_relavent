package reflection;

import LoggerLib.Logger;

public class RecursiveTest extends BaseCase {
    public String getClassName(){
        String className = recur(5);
        return className;
    }

    public String recur(int deep) {

        if(deep > 0) {
            return recur(--deep) + "recur ";
        } else {
            return "recur ";
        }
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName();
        Logger.reportString(className, "RecursiveTest");    // expect result: "(recur ){5}"
        doReflect(className);
    }
}
