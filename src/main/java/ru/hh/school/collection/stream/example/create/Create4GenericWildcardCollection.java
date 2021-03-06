package ru.hh.school.collection.stream.example.create;

import ru.hh.school.collection.stream.example.dto.Applicant;
import ru.hh.school.collection.stream.example.dto.Employer;
import ru.hh.school.collection.stream.example.dto.User;

import java.util.*;

public class Create4GenericWildcardCollection {

  public static void main(String[] str) {
    List<User> users = new ArrayList<>();

    users.add(new Applicant("appl1"));
    users.add(new Employer("empl2"));

    List<? super Applicant> objs = users;

    /*
     * Мы знаем, что в списке содержатся родители Applicant
     * Мы можем работать с ними только как с Object.
     * Например, вызвать toString()
     */

//    objs.add(new Applicant("appl2"));
//    objs.add(new Employer("empl1"));
//    objs.add(new Object());
//    objs.add(new User("user"));

    for (Object user: objs) {
      System.out.println(user.getClass().getName());
      System.out.println(user);
    }
  }
}
