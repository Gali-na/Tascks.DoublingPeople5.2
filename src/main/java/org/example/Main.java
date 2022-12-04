package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Person person1 = new Person();
        person1.setSurname("Zolotareva");
        person1.setName("Natalia");
        person1.setAge(18);
        person1.setGender(Gender.WOMAN);
        Person person2 = new Person();
        person2.setSurname("Ostapenko");
        person2.setName("Galina");
        person2.setAge(18);
        person2.setGender(Gender.WOMAN);
        Person person3 = new Person();
        person3.setSurname("Smirnova");
        person3.setName("Sveta");
        person3.setAge(18);
        person3.setGender(Gender.WOMAN);
        ArrayList<Person> person= new ArrayList<Person>();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        System.out.println(person);
        System.out.println("////////////////");
        System.out.println(MyQueue.doublingPeople(person,1));
    }
}
