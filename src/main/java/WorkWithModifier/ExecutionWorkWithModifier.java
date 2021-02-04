package WorkWithModifier;

import static WorkWithModifier.ClassWithModifier.callWithoutObject;

public class ExecutionWorkWithModifier {


    public static void main(String[] args) {
        ClassWithoutModifier simple = new ClassWithoutModifier();
        ClassWithPackageModifier packageModifier = new ClassWithPackageModifier();

        simple.opened();
        simple.defend();
        packageModifier.callPublic();
        packageModifier.callPackagePrivetMethod();
        callWithoutObject();
    }
}

