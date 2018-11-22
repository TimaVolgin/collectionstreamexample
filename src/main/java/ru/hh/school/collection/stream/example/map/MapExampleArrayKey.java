package ru.hh.school.collection.stream.example.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Пример изменения ключа в Map, где array в качестве ключа
 */
class MapExampleArrayKey {

    public static void main(String str[]) {
        Map<byte[], String> map = new HashMap<>();
        byte[] mass = new byte[5];
        mass[0] = 0;
        map.put(mass, "value1");
        System.out.println(map.get(mass));
        mass[0] = 1;
        System.out.println(map.get(mass));
        byte[] mass2 = new byte[5];
        mass[0] = 1;
        System.out.println(map.get(mass2));
    }
}
