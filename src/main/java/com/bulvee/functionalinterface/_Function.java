package com.bulvee.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementByOne = incrementByOne(1);
        System.out.println("Incremented value:" + incrementByOne);

        Integer incrementedByOnFunction = incrementByOneFunction.apply(1);
        System.out.println("Incremented value:" + incrementedByOnFunction);

        Integer multipliedByTenFuncion = multiplyByTen.apply(incrementedByOnFunction);
        System.out.println(multipliedByTenFuncion);

        Function<Integer, Integer> incrementByOneAndMultiplyByTen = incrementByOneFunction.andThen(multiplyByTen);
        System.out.println(incrementByOneAndMultiplyByTen.apply(5));

        //Increment and incrementByOneAndMultiplyBy
        int incrementedAndMultiplied = incrementByOneAndMultiplyBy(1, 20);
        System.out.println("//incrementByOneAndMultiplyBy " + incrementedAndMultiplied);

        Integer incrementedByOneAndMultipliedByFunction = incrementByOneAndMultplyByFunction.apply(1, 20);
        System.out.println("//incrementedByOneAndMultipliedByFunction " + incrementedByOneAndMultipliedByFunction);

    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultplyByFunction = (toIncrement, toMultply) -> (toIncrement +1) * toMultply;

    static int incrementByOne(int value) {
        return value + 1;
    }

    static int incrementByOneAndMultiplyBy(int toIncrement, int toMultply){
        return (toIncrement + 1) * toMultply;
    }
}
