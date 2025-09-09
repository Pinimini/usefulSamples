package ru.simple.livecoding.cachepattern;

import java.util.Arrays;

public class Demo {


    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(numbers)
                .peek(System.out::println)
                .filter(n -> n > 4)
                .findFirst().getAsInt());
    }




}
