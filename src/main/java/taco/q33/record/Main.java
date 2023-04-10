package taco.q33.record;

import taco.q33.record.legacy.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Peter", 35);
        taco.q33.record.record.Person p2 = new taco.q33.record.record.Person("John", 47);
        System.out.println(p1);
        System.out.println(p2);
    }
}
