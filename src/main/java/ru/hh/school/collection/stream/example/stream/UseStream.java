package ru.hh.school.collection.stream.example.stream;

import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseStream {

  public static void main(String[] str) {
    Stream.generate(() -> 0).limit(5).forEach(v -> System.out.println(v));
    System.out.println("--------------------");
    Collections.nCopies(5, 0).stream().forEach(v -> System.out.println(v));
    System.out.println("--------------------");
    IntStream.range(0, 5).forEach(v -> System.out.println(v));
  }
}
