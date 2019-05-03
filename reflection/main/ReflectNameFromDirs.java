package reflection.main;

import LoggerLib.Logger;
import reflection.BaseCase;

public class ReflectNameFromDirs extends BaseCase {
    public String getClassName(String[] dirs) {
        String className = null;
        for (String dir : dirs) {
            className += dir;
            className += ".";
        }

        return className;
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String[] dirs = new String[]{"java", "lang", "Object"};
        String className = getClassName(dirs);
        Logger.reportString(className, "ReflectNameFromDirs");     //expect result: "java.lang.Object"
        doReflect(className);
    }
//
//    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
//        ReflectNameFromDirs r = new ReflectNameFromDirs();
//        r.test();
//    }

}
