package com.bulvee.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("5511992191234"));
        System.out.println(isPhoneNumberValid("0511992191234"));

        System.out.println(isPhoneNumberValidPredicate.equals("5511992191234"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("5511992191230"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("0111992191230"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("55") && phoneNumber.length() == 13;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("55") && phoneNumber.length() == 13;
    }
}
