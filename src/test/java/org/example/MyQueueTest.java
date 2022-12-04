package org.example;



import org.junit.jupiter.api.Test;

import java.security.acl.Group;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueTest {
    private ArrayList<Person> createGroup() {
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
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        return persons;
    }

    @Test
    public void testDoublingPeople_NumberGlassesIs0_ErrorMessage() {
        String actualResult = MyQueue.doublingPeople(createGroup(), 0);
        String expectedResult = "Information about the number of glasses is not correct";
        assertEquals(expectedResult, expectedResult);
    }

    @Test
    public void testDoublingPeople_NumberGlassesIsLessThan0_ErrorMessage() {
        String actualResult = MyQueue.doublingPeople(createGroup(), -1);
        String expectedResult = "Information about the number of glasses is not correct";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDoublingPeople_NumberGlassesIsMoreThan0_PositiveRuzult() {
        String actualResult = MyQueue.doublingPeople(createGroup(), 1);
        assertEquals("[Ostapenko Galina WOMAN 18 , Smirnova Sveta WOMAN 18 , Zolotareva Natalia WOMAN 18 , Zolotareva Natalia WOMAN 18 ]", actualResult);
    }

    @Test
    public void testDoublingPeople_ListPeopleIsEmpty_ErrorMessage() {
        ArrayList<Person> person = new ArrayList<Person>();
        String expectedResult = "the list is empty";
        assertEquals(expectedResult, MyQueue.doublingPeople(person, 1));
    }

    @Test
    public void testDoublingPeople_ListPeopleIsNull_ErrorMessage() {
         ArrayList<Person> person = null;
        String expectedResult = "list does not exist";
        assertEquals(expectedResult, MyQueue.doublingPeople(person, 1));
    }

}