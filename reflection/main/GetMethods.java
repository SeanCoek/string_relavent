package reflection.main;


import LoggerLib.Logger;

import java.lang.reflect.Method;

public class GetMethods {

    public static void main() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        String className = "reflection.others.ReflectTestClass";
        Class c = Class.forName(className);
        Method[] methods = c.getMethods();
        String methodName = null;
        for(Method m:methods){
            methodName = m.getName();
            Logger.reportString(methodName, "GetMethods_methodNames");
        }
        Method m1 = c.getMethod("m1", (Class<?>[]) null);
        methodName = m1.getName();
        Logger.reportString(methodName, "GetMethods_methodName");
    }
}
