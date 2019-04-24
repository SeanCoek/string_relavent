package reflection;

import LoggerLib.Logger;

public class Reflect2 extends BaseCase {
    public String getClassName(String[] dirs) {
        String className = null;
        for (String dir : dirs) {
            className += dir;
            className += ".";
        }
        assert className != null;
        return className.substring(0, className.length()-1);
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String[] dirs = new String[]{"java", "lang", "Object"};
        String className = getClassName(dirs);
        Logger.reportString(className, "Reflect2");     //expect result: "java.lang.Object"
        doReflect(className);
    }

}
