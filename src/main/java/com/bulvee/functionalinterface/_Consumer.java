package com.bulvee.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "5511999999990"));
        greetCustomerConsumer.accept(new Customer("Maria", "5511999999990"));
        greetCustomerBiConsumer.accept(new Customer("Maria", "5511999999990"), false);
        greetCustomerBi(new Customer("Maria", "5511999999990"), false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "+ (showPhoneNumber ? customer.customerPhoneNumber : ""));
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "+ customer.customerPhoneNumber);
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerBi(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : ""));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "{ customerName: " + this.customerName + "," +
                    "customerPhoneNumber: " + this.customerPhoneNumber +
                    "}";
        }
    }
}
