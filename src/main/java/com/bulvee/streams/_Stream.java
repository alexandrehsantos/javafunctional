package com.bulvee.streams;

import com.bulvee.imperative.Main;

import javax.swing.*;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Daysa", Gender.FEMALE),
                new Person("Oscar", Gender.MALE),
                new Person("Benedito", Gender.MALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)
        );

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);
        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);
        boolean allMatch = people.stream().noneMatch(personPredicate);
        System.out.println(allMatch);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "{ name: " + name + ", " +
                    "gender: " + gender +
                    "}";
        }
    }

    static enum Gender {
        MALE,
        FEMALE,
        PREFER_NOT_TO_SAY;
    }
}
