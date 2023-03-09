package com.bulvee.imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Daysa", Gender.FEMALE),
                new Person("Oscar", Gender.MALE),
                new Person("Benedito", Gender.MALE)
        );

        System.out.println("Printing female persons in Imperative mode.");
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                System.out.println(person);
            }
        }

        System.out.println("Printing female persons in Declarative mode.");

        people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "{ name: " + name + ", " +
                    "gender: " + gender +
                    "}";
        }
    }

    static enum Gender {
        MALE,
        FEMALE;
    }

}