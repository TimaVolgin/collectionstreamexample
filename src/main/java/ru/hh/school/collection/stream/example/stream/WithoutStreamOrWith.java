package ru.hh.school.collection.stream.example.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Нужен или нет стрим в этих примерах?
 */
public class WithoutStreamOrWith {

  private static List<Integer> list = new ArrayList<>();

  private static void init() {
    list.add(4);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
  }

  public static void main(String [] str) {
    init();

//    list.stream().forEach(v -> System.out.println(v));
//    // or
//    list.forEach(v -> System.out.println(v));

    System.out.println("-------------------------------------");
    Set<Integer> set = null;
//    set = new HashSet<>(list);
//    // or
//    set = list.stream().collect(Collectors.toSet());
    System.out.println(set);

    System.out.println("-------------------------------------");
    Integer[] arr = null;
//    arr = list.stream().toArray(Integer[]::new);
//    // or
//    arr = list.toArray(new Integer[0]);
    Arrays.stream(arr).forEach(v -> System.out.println(v));

    System.out.println("-------------------------------------");
//    System.out.println(list.stream().count());
//    // or
//    System.out.println(list.size());

    System.out.println("-------------------------------------");
//    System.out.println(list.stream().max(Comparator.naturalOrder()).get());
//    // or
//    System.out.println(Collections.max(list, Comparator.naturalOrder()));

    System.out.println("-------------------------------------");
//    System.out.println(list.stream().filter(v -> v != 4).findFirst().isPresent());
//    // or
//    System.out.println(list.stream().anyMatch(v -> v != 4));
  }
}
