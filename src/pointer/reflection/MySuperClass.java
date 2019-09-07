package pointer.reflection;

public class MySuperClass {
    private String stringSuperClassField;
    private int intSuperClassField;

    public MySuperClass(String stringField, int intField) {
        this.stringSuperClassField = stringField;
        this.intSuperClassField = intField;
    }

    public String getStringSuperClassField() {
        return stringSuperClassField;
    }

    public int getIntSuperClassField() {
        return intSuperClassField;
    }

    public void show() {
        System.out.println("MySupperClass shows.");
    }

    @Override
    public String toString() {
        return "MySupperClass{" +
                "stringField='" + stringSuperClassField +
                "', intField=" + intSuperClassField +
                '}';
    }
}
