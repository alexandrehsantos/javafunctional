package com.bulvee.finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", null, value -> {
            System.out.println("no lastName provided for: " + value);
        });

        hello2("John", null, () -> {
            System.out.println("no lastName provided");
        });

    }

    // Sample callback with consumer
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("Hello " + firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    // Sample callback with Runnable
    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println("Hello " + firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
