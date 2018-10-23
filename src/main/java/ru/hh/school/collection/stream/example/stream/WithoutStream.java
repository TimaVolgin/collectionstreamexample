package ru.hh.school.collection.stream.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WithoutStream {

  public static void main(String [] str) {
    List<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    System.out.println(list);

    list.forEach(v -> System.out.println(v));
    Set<Integer> set = new HashSet<>(list);
    System.out.println(set);

    Integer[] arr = list.toArray(new Integer[0]);
    Arrays.stream(arr).forEach(v -> System.out.println(v));
  }
}
