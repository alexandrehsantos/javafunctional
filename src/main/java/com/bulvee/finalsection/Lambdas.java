package com.bulvee.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if(name.isBlank()) {
                throw new IllegalArgumentException("name must not be null");
            }
            System.out.println("Age: " + age);
            return name.toUpperCase();
        };

        int age = 20;

        String upperCasedName = upperCaseName.apply("Alex", age);
        System.out.println(upperCasedName);


    }
}
