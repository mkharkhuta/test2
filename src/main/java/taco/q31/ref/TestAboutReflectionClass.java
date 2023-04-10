package taco.q31.ref;

import java.util.Arrays;

class TestAboutReflectionClass {
    static void doReflectionTest() throws Exception {
        var aClass = AboutReflectionClass.class;
        var isOverrideAnnoExisting = Arrays
              .stream(aClass.getDeclaredMethods())
              .anyMatch(method ->
                    method.isAnnotationPresent(Override.class));
        System.out.println(isOverrideAnnoExisting);
    }

    public static void main(String[] args) throws Exception {
        doReflectionTest();
    }
}