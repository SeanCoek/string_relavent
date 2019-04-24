
public class Reflect1 extends BaseCase {

    public String getClassName() {
        return getClassNameFromExternal();
    }

    private String getClassNameFromExternal() {
        return "java.lang.Object";
    }

    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.doReflect(getClassName());
    }
}


