package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue {
    public static String doublingPeople(ArrayList<Person> list, int numberGlasses) {
        if (list==null) {
            return "list does not exist";
        }
        if (list.isEmpty()) {
            return "the list is empty";
        }
        if (numberGlasses<=0) {
            return "Information about the number of glasses is not correct";
        }
        ArrayList<Person> listMyQueue = list;
        while (numberGlasses != 0) {
           ArrayList<Person>afterGetClass= new ArrayList<Person>();
           Iterator<Person> iterator = list.iterator();
           while (iterator.hasNext() && numberGlasses != 0) {
               Person person = iterator.next();
               --numberGlasses;
               iterator.remove();
               afterGetClass.add(person);
               afterGetClass.add(person);
           }
           list.addAll(afterGetClass);
       }
        return list.toString();
    }
}
