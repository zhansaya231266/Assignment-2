package models;
import models.Person;
import models.Employee;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        Student Ringo = new Student("Ringo", "Starr", 2.0);
        Employee John = new Employee("John", "Lennon", "Driver", 27045.78);
        Student Paul = new Student("Paul", "McCartney", 2.8);
        Employee George = new Employee("George", "Harrison", "Electrician", 50000.00);

        peopleList.add(John);
        peopleList.add(George);
        peopleList.add(Paul);
        peopleList.add(Ringo);

        Collections.sort(peopleList);

        printData(peopleList);
    }
    public static void printData(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person.getId() + ". " +
                    person.getName() + " " + person.getSurname() + " earns " +
                    person.getPaymentAmount() + " tenge");
        }
    }
}