package Strategy;

import java.util.*;

class Client {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Doe", 20, false),
                new Person("Smith", 30, true),
                new Person("Old", 70, true)
        );

        PeopleCounter counter = new PeopleCounter();

        counter.setFilter(new AdultFilter());
        System.out.println(counter.count(people)); // Adult count: 3

        counter.setFilter(new SeniorFilter());
        System.out.println(counter.count(people)); // Senior count: 1

        counter.setFilter(new MarriedFilter());
        System.out.println(counter.count(people)); // Married count: 2

    }
}