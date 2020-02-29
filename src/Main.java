import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Bike harleyDavidson = new Bike();
        Machines t1000 = new Terminator();

        //Get name Class:
        System.out.println(Reflection.getNameClass(t1000));
        System.out.println("_____________________________");
        //Class modifier research:
        Reflection.getClassModifierResearch(t1000);
        //Finding superclasses:
        System.out.println(Reflection.findingSuperClasses(t1000));
        System.out.println("_____________________________");
        //Defining Interfaces Implemented by a Class:
        Reflection.definingInterfacesImplementedByAClass();
        //Research, obtain and set the values of class fields:
        Reflection.valuesClassFields(t1000);
        //Study class constructors
        Reflection.StudyClassConstructors(t1000);
        //Researching information about a method, calling a method:
        Reflection.informationAboutMethod(t1000);
    }

}