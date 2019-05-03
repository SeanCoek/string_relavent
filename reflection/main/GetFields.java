package reflection.main;

import LoggerLib.Logger;

import java.lang.reflect.Field;

public class GetFields {
    public static void main() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        String className = "reflection.others.ReflectTestClass";
        Class c = Class.forName(className);
        String fieldName = null;
        Field [] fields = c.getFields();
        for(Field field:fields) {
            fieldName = field.getName();
            Logger.reportString(fieldName, "GetFields_fieldNames");
        }
        Field f = c.getField("strField");
        fieldName = f.getName();
        Logger.reportString(fieldName, "GetFields_fieldName");
    }
}
