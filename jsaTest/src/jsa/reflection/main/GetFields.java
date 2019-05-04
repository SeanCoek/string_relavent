package jsa.reflection.main;


import java.lang.reflect.Field;

public class GetFields {
    public void test() throws ClassNotFoundException, NoSuchFieldException {
        String className = "jsa.reflection.others.ReflectTestClass";
        Class c = Class.forName(className);
        String fieldName = null;
        Field [] fields = c.getFields();
        for(Field field:fields) {
            fieldName = field.getName();
        }
        Field f = c.getField("strField");
        fieldName = f.getName();
    }
}
