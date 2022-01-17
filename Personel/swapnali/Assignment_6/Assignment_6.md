Questions Consider the following two classes:

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


Question A : Which method overrides a method in the superclass?
Answer     : methodTwo


Question B : Which method hides a method in the superclass?
Answer     : methodFour


Question C : What do the other methods do?
Answer     : compile-time errors



