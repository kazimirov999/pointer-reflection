package pointer.reflection;

public class Main {

    public static void main(String[] args) {
        MySubClass subClass = new MySubClass("First", 123);

        ObjectReflection objectReflection = new ObjectReflection(subClass);
        objectReflection.showAll();

        new ClassReflection(MySubClass.class).showAll();
    }
}
