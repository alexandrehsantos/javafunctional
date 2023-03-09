package com.bulvee.optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Sample 1
        Optional.ofNullable("Hello!")
                .ifPresent(System.out::println);
        //Sample 2
        Optional.ofNullable("email@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to: "+email));
        //Sample 3
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to: "+email),
                        ()-> {
                            System.out.println("Cannot send email");
                        });
        //Sample 4
        Optional.ofNullable(null)
                .orElseThrow(() -> new RuntimeException("Cannot send email"));

    }
}
