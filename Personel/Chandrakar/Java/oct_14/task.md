. Consider the following two classes:

public class ClassA {
    public void methodOne(int i) {
    }
    public void methodTwo(int i) {
    }
    public static void methodThree(int i) {
    }
    public static void methodFour(int i) {
    }
}

public class ClassB extends ClassA {
    public static void methodOne(int i) {
    }
    public void methodTwo(int i) {
    }
    public void methodThree(int i) {
    }
    public static void methodFour(int i) {
    }
}


Qus A:  Which method overrides a method in the superclass?
Ans    :methodTwo.


Qus B : Which method hides a method in the superclass?
Ans    :methodFour.


Qus C : What do the other methods do?
Ans :    compile-time errors


