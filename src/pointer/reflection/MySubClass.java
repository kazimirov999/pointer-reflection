package pointer.reflection;

public class MySubClass extends MySuperClass {
    private String stringSubClassField;
    private float floatSubClassField;

    public MySubClass(String stringField, int intField) {
        super(stringField, intField);
    }

    public MySubClass(String stringField, int intField, String stringSubClassField, float floatSubClassField) {
        super(stringField, intField);
        this.stringSubClassField = stringSubClassField;
        this.floatSubClassField = floatSubClassField;
    }

    public String getStringSubClassField() {
        return stringSubClassField;
    }

    public float getFloatSubClassField() {
        return floatSubClassField;
    }

    public void method() {
        display("MySub class runs display.");
    }

    private void display(String text) {
        System.out.println(text);
    }
}
