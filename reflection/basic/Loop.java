package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class Loop extends BaseCase {


    public static void main() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Loop l = new Loop();
        String className = null;
        String[] names = {"java.lang.Loop0", "java.lang.Loop1", "java.lang.Loop2", "java.lang.Loop3",
                            "java.lang.Loop4", "java.lang.Loop5", "java.lang.Loop6"};
        for(int i=0; i<4; i++) {
            className = names[i];
            Logger.reportString(className, "Loop");
            l.doReflect(className);
        }
    }

}
