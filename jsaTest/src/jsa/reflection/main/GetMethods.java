package jsa.reflection.main;



import java.lang.reflect.Method;

public class GetMethods {

    public void test() throws ClassNotFoundException, NoSuchMethodException {
        String className = "jsa.reflection.others.ReflectTestClass";
        Class c = Class.forName(className);
        Method[] methods = c.getMethods();
        String methodName = null;
        for(Method m:methods){
            methodName = m.getName();
        }
        Method m1 = c.getMethod("m1", (Class<?>[]) null);
        methodName = m1.getName();
    }
}
