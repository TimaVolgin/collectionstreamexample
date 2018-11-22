package ru.hh.school.collection.stream.example.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Примеры использования stream, появившиеся в 9, 10 java
 */
public class StreamJava910 {

    public static void main(String str[]) {
        iterateExample();
        takeDropWhileExample();
        ofNullableExample();
        toUnmodifiableSet();
    }

    private static void iterateExample() {
        System.out.println();
        System.out.println("Iterate example:");
        Stream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println);
    }

    private static void takeDropWhileExample() {
        System.out.println();
        System.out.println("takeWhileExample");
        Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("dropWhileExample:");
        Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10)
                .dropWhile(s -> !s.contains("sssss"))
                .forEach(System.out::println);
    }

    private static void ofNullableExample() {
        System.out.println();
        System.out.println("ofNullableExample:");
        List<Integer> collection = Stream.iterate(0, i -> i < 10, i -> i + 1).collect(Collectors.toList());
        Map<Integer, Integer> map = Stream.iterate(0, i -> i < 10, i -> i + 2)
                .collect(Collectors.toMap(Function.identity(), Function.identity()));

        collection.stream()
                .flatMap(s -> {
                    Integer temp = map.get(s);
                    return temp != null ? Stream.of(temp) : Stream.empty();
                })
                .forEach(System.out::println);

        System.out.println();
        System.out.println("with null:");
        collection.stream()
                .flatMap(s -> Stream.of(map.get(s)))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("optimization:");
        collection.stream()
                .flatMap(s -> Stream.ofNullable(map.get(s)))
                .forEach(System.out::println);
    }

    private static void toUnmodifiableSet() {
        System.out.println();
        System.out.println("UnmodifiableSet example:");
        Set<Integer> set = Stream.iterate(0, i -> i < 10, i -> i + 1).collect(Collectors.toUnmodifiableSet());
        System.out.println(set);
        set.add(11);
    }
}
