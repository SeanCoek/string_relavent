package reflection;

public class BaseCase {

    public void doReflect(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(className);
        Object o = c.newInstance();
    }
}
