package jsa.reflection.main;

import jsa.reflection.BaseCase;

public class ReflectNameFromDirs extends BaseCase {
    public String getClassName() {
        String[] dirs = new String[]{"java", "lang", "Object"};
        String className = null;
        for (String dir : dirs) {
            className += dir;
            className += ".";
        }

        return className;
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName();
        Class.forName(className);
    }


}
