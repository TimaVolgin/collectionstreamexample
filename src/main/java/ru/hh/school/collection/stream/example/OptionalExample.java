package ru.hh.school.collection.stream.example;

import java.util.Optional;

public class OptionalExample {

    public static void main(String str[]) {
        example1();
    }

    public static void example1() {
        Optional<String> opt = Optional.of("value");
        System.out.println(opt.orElse(ifEmpty()));
    }

    public static String ifEmpty() {
        System.out.println("start if empty");
        return "empty";
    }
}
