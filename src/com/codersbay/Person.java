package com.codersbay;

public class Person {

    public Integer PersonNumber;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String address;
    public String gender;

    public Person(Integer PersonNumber,String firstName, String lastName, String dateOfBirth, String address, String gender) {
        this.PersonNumber = PersonNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Person" + PersonNumber + "{ " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
