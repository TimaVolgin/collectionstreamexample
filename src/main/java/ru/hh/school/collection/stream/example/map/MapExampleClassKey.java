package ru.hh.school.collection.stream.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExampleClassKey {

    public static void main(String str[]) {
        changeKey();
//        differentKey();
    }

    public static void changeKey() {
        Map<ExampleClass, String> map = new HashMap<>();
        ExampleClass e1 = new ExampleClass(12, "test");
        map.put(e1, "value");
        System.out.println("value: " + map.get(e1));
        System.out.println("size: " + map.size());
        e1.setText("test2");
        System.out.println("value: " + map.get(e1));
        System.out.println("size: " + map.size());
        e1.setId(13);
        System.out.println("value: " + map.get(e1));
        System.out.println("size: " + map.size());
        System.out.println(map.entrySet().iterator().next().getValue());
    }

    public static void differentKey() {
        Map<ExampleClass, String> map = new HashMap<>();
        ExampleClass e1 = new ExampleClass(12, "test");
        ExampleClass e2 = new ExampleClass(12, "test2");
        map.put(e1, "value");
        System.out.println("value: " + map.get(e1));
        System.out.println("size: " + map.size());
        map.put(e2, "value2");
        System.out.println("value1: " + map.get(e1));
        System.out.println("value2: " + map.get(e2));
        System.out.println("size: " + map.size());
    }
}
