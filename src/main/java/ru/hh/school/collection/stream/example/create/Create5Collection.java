package ru.hh.school.collection.stream.example.create;

import java.util.ArrayList;
import java.util.List;

public class Create5Collection {

  public static void main(String [] str) {
    List<Object> list = new ArrayList<>();

    list.add("test");
    list.add(787);

    for (Object obj : list) {
      System.out.println(obj.getClass().getName());
      System.out.println(obj);
    }
  }
}
