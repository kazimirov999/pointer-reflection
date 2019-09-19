package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionInfo {

    void getInfoClassReflection(Class clazz){
        System.out.println("Package -> " + clazz.getPackage());
        System.out.println("Package name-> " + clazz.getPackage().getName());
        System.out.println("Modifiers -> " + getModifierName(clazz.getModifiers()));
        System.out.println("Class name -> " + clazz.getSimpleName());


        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println("field -> " + f);
            System.out.println("field type ->" + f.getType());
            System.out.println("field modifiers ->" + getModifierName(f.getModifiers()));
            System.out.println("field name->" + f.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            m.setAccessible(true);
            System.out.println("method -> " + m);
            System.out.println("method name ->" + m.getName());
            System.out.println("method return type ->" + m.getReturnType());
            System.out.println("method modifier ->" + getModifierName(m.getModifiers()));
        }

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor -> " + c);
        }

        System.out.println("Super Class name -> " + clazz.getSuperclass().getSimpleName());

        Constructor[] constructors1 = clazz.getSuperclass().getDeclaredConstructors();
        for (Constructor sc : constructors1) {
            System.out.println("Super constructor -> " + sc);
        }

        Method[] methods1 = clazz.getSuperclass().getDeclaredMethods();
        for (Method sm : methods1) {
            sm.setAccessible(true);
            System.out.println("Super class method -> " + sm);
            System.out.println("Super class method name ->" + sm.getName());
            System.out.println("Super class method return type ->" + sm.getReturnType());
            System.out.println("super class method modifier ->" + getModifierName(sm.getModifiers()));
        }
    }

    void getInfoObjectReflection(Object obj){
        System.out.println("package ->" + obj.getClass().getPackage());
        System.out.println("package name->" + obj.getClass().getPackageName());
        System.out.println("class name -> " + obj.getClass().getSimpleName());
        System.out.println("class modifiers -> " + getModifierName(obj.getClass().getModifiers()));


        Constructor[] constructors2 = obj.getClass().getDeclaredConstructors();
        for (Constructor c : constructors2) {
            System.out.println("constructors ->" + c);
        }

        Field[] fields1 = obj.getClass().getDeclaredFields();
        for (Field f : fields1) {
            System.out.println("field ->" + f);
            System.out.println("field type ->" + f.getType());
            System.out.println("field modifier ->" + getModifierName(f.getModifiers()));
            System.out.println("field name ->" + f.getName());
        }

        Method[] methods2 = obj.getClass().getDeclaredMethods();
        for (Method m : methods2) {
            System.out.println("method ->" + m);
            System.out.println("method name ->" + m.getName());
            System.out.println("method modifier ->" + getModifierName(m.getModifiers()));
            System.out.println("method return type ->" + m.getReturnType());
        }

        System.out.println("super class package ->" + obj.getClass().getSuperclass().getPackage());
        System.out.println("super class package name ->" + obj.getClass().getSuperclass().getPackageName());
        System.out.println("super class name ->" + obj.getClass().getSuperclass());
        System.out.println("super class modifier ->" + getModifierName(obj.getClass().getSuperclass().getModifiers()));

        Constructor[] constructors3 = obj.getClass().getSuperclass().getDeclaredConstructors();
        for (Constructor c : constructors3) {
            System.out.println("super class constructors ->" + c);
        }

        Field[] fields3 = obj.getClass().getSuperclass().getDeclaredFields();
        for (Field sf : fields3) {
            System.out.println("super class field ->" + sf);
            System.out.println("super class field type ->" + sf.getType());
            System.out.println("super class field modifier ->" + getModifierName(sf.getModifiers()));
            System.out.println("field name ->" + sf.getName());
        }

        Method[] declaredMethods = obj.getClass().getSuperclass().getDeclaredMethods();
        for (Method sm : declaredMethods) {
            System.out.println("super class method ->" + sm);
            System.out.println("super class method name ->" + sm.getName());
            System.out.println("super class method modifier ->" + getModifierName(sm.getModifiers()));
            System.out.println("super class method return type ->" + sm.getReturnType());
        }
    }

    String getModifierName(int n){
        String modifiers = "";
        if(Modifier.isPublic(n)){
            modifiers+="public";
        }
        if(Modifier.isProtected(n)){
            modifiers+="protected";
        }
        if(Modifier.isPrivate(n)){
            modifiers+="private";
        }
        if(Modifier.isAbstract(n)){
            modifiers+="abstract";
        }
        if(Modifier.isStatic(n)){
            modifiers+="static";
        }
        return modifiers;
    }
}
