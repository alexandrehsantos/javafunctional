package com.bulvee.combinatorPattern;

import java.time.LocalDate;

import static com.bulvee.combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "email@gmail.com",
                "+019088908908098",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidator().isValid(customer));

        // We can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAnAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
