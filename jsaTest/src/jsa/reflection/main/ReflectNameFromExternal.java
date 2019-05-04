package jsa.reflection.main;

import jsa.reflection.BaseCase;

public class ReflectNameFromExternal extends BaseCase {

    public String getClassName() {
        return getClassNameFromExternal();
    }

    private String getClassNameFromExternal() {
        return "java.lang.Object";
    }

    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = getClassName();
        Class.forName(className);
    }
}


