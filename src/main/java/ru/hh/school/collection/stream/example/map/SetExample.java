package ru.hh.school.collection.stream.example.map;

import ru.hh.school.collection.stream.example.ExampleClass;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String str[]) {
        Set<ExampleClass> set = new HashSet<>();
        ExampleClass e1 = new ExampleClass(12, "test");
        set.add(e1);
        System.out.println(set.remove(e1));
        System.out.println("size: " + set.size());

        set.add(e1);
        e1.setText("test2");
        System.out.println(set.remove(e1));
        System.out.println("size: " + set.size());

        set.add(e1);
        e1.setId(13);
        System.out.println(set.remove(e1));
        System.out.println("size: " + set.size());
    }
}
