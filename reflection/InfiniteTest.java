package reflection;

import LoggerLib.Logger;

public class InfiniteTest extends BaseCase {

    public String getClassName(){
        String className = "";
        for(int i=1; i < Integer.MAX_VALUE; i++) {
//            if(i < 5) {
//                className += "x";
//            }
//            else {
//                className += "y";
//            }
            className += 'x';
        }
        return className;
    }

    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String className = getClassName();
        Logger.reportString(className, "InfiniteTest");     // expect result: "x*"
        doReflect(className);
    }
}