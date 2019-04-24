package reflection;// ref: https://www.owasp.org/index.php/Unsafe_use_of_Reflection

import LoggerLib.Logger;

public class OWASP {
    public void doAction(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(className);
        Logger.reportString(className, "OWASP");       // expect result: "Command1", "CommandEvil"
        Worker w = (Worker)c.newInstance();
        w.doAction();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        OWASP demo = new OWASP();
        demo.doAction("Command1");
        demo.doAction("CommandEvil");
    }
}

interface Worker {
    void doAction();
}

class Command1 implements Worker {

    Command1() {
        System.out.println("Command1 Constructor");
    }
    @Override
    public void doAction() {
        System.out.println("Command1 doAction --> Safe");
    }
}

class CommandEvil implements Worker {

    CommandEvil() {
        System.out.println("CommandEvil Constructor");
    }

    @Override
    public void doAction() {
        System.out.println("CommandEvil doAction --> Unsafe");
    }
}

