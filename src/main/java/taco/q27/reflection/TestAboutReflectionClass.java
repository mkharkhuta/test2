package taco.q27.reflection;

import java.lang.reflect.InvocationTargetException;

class TestAboutReflectionClass {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        var clazz = AboutReflectionClass.class;
        var constructor = clazz.getDeclaredConstructor();
        var instance = constructor.newInstance();
        var valField =  clazz.getDeclaredFields()[0];
        valField.setAccessible(true);
        valField.set(instance, 100);
    }
}