package reflection;

import LoggerLib.Logger;

public class Reflect1 extends BaseCase {

    public String getClassName() {
        return getClassNameFromExternal();
    }

    private String getClassNameFromExternal() {
        return "java.lang.Object";
    }

    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = getClassName();
        Logger.reportString(className, "Reflect1");     //expect result: "java.lang.Object"
        doReflect(className);
    }
}


