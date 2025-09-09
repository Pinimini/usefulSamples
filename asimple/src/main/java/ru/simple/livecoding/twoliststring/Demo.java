package ru.simple.livecoding.twoliststring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

/*
    Даны два листа стрингов.
    Написать метода, которывй возвращает совпадение (общие элементы) между списками строк (List<String>)
*/

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        List<String> secondList = Arrays.asList("one", "three", "five");

        firstList.retainAll(secondList);
        System.out.println(firstList);
    }

}
