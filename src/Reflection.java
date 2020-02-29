import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

public class Reflection {

    private Reflection() {
    }


    public static String getNameClass(Object o) {
        Class<?> clazz = o.getClass();
        return clazz.getName();
    }

    public static void getClassModifierResearch(Object o) {
        Class<?> clazz = o.getClass();
        int mods = clazz.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        System.out.println("_____________________________");
    }

    public static Class<?> findingSuperClasses(Object o) {
        Class<?> clazz = o.getClass();
        return clazz.getSuperclass();
    }

    public static void definingInterfacesImplementedByAClass() {
        Class<?> clazz = LinkedList.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }
        System.out.println("_____________________________");
    }

    public static void valuesClassFields(Object o) {
        Class<?> clazz = o.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println("_____________________________");
    }

    public static void StudyClassConstructors(Object o) {
        Class<?> clazz = o.getClass();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println(constructor.getName());
        }
        System.out.println("_____________________________");
    }

    public static void informationAboutMethod(Object o) {
        Class<?> clazz = o.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println("_____________________________");
    }


}





