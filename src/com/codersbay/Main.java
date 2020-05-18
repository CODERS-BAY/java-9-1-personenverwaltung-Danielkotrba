package com.codersbay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PersonManagement personManagement = new PersonManagement();

        Person P1 = personManagement.createPerson(1,"Horst","Kotrba","30.08.1966","Leharstraße 21 4050 Traun","male");
        Person P3 = personManagement.createPerson(2,"Dominik","Kotrba","03.08.2001","Leharstraße 21 4050 Traun","male");
        Person P2 = personManagement.createPerson(3,"Daniel","Kotrba","01.11.1999","Leharstraße 21 4050 Traun","malemale");
        Person P4 = personManagement.createPerson(4,"Roland","Kotrba","06.03.2006","Leharstraße 21 4050 Traun","male");
        Person P5 = personManagement.createPerson(5,"Vanessa","Geiger","20.09.2002","hammerweg 3 4050 Traun","female");
        Person P6 = personManagement.createPerson(6,"Unknown", "Unknown", "Unknown", "Unknown", "Unknown");

        PersonManagement.addPerson(P1);
        PersonManagement.addPerson(P2);
        PersonManagement.addPerson(P3);
        PersonManagement.addPerson(P4);
        PersonManagement.addPerson(P5);
        personManagement.addPerson(P6);

        PersonManagement.List();

        personManagement.removePerson(P6);
        System.out.println("----Person removed----");

        personManagement.List();

    }
}




