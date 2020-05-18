package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonManagement {
    static List<Person> LIST_OF_PERSONS = new ArrayList<>();

    public static Person createPerson(Integer PersonNumber,String firstName, String lastName, String dateOfBirth, String address, String gender) {
        Person person = new Person(PersonNumber ,firstName, lastName, dateOfBirth, address, gender);
        return person;
    }

    public static void addPerson(Person person) {
        LIST_OF_PERSONS.add(person);
    }

    public static void removePerson(Person person) {
        LIST_OF_PERSONS.remove(person);
    }

    public static void List() {
        for (Person person : LIST_OF_PERSONS) {
            System.out.println(person);
        }
    }

}