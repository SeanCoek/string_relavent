package reflection.main;

import LoggerLib.Logger;
import reflection.BaseCase;

public class ReflectNameFromExternal extends BaseCase {

    public String getClassName() {
        return getClassNameFromExternal();
    }

    private String getClassNameFromExternal() {
        return "java.lang.Object";
    }

    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = getClassName();
        Logger.reportString(className, "ReflectNameFromExternal");     //expect result: "java.lang.Object"
        doReflect(className);
    }

}


