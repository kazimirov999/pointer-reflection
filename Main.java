package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String... a) {
        Test test = new Test("Test", 0, 22.22);
        ReflectionInfo reflectionInfo = new ReflectionInfo();
        reflectionInfo.getInfoClassReflection(Test.class);
        reflectionInfo.getInfoObjectReflection(test);
    }


}
