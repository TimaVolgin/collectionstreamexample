package ru.hh.school.collection.stream.example.create;

import ru.hh.school.collection.stream.example.dto.Applicant;
import ru.hh.school.collection.stream.example.dto.Employer;
import ru.hh.school.collection.stream.example.dto.User;

import java.util.ArrayList;
import java.util.List;

public class Create3GenericWildcardCollection {

  public static void main(String[] str) {
    List<Applicant> applicants = new ArrayList<>();

    applicants.add(new Applicant("appl1"));

    List<? extends User> objs = applicants;

    /*
     * Мы знаем, что в списке содержатся объекты унаследованные от User, но какие именно не знаем.
     * Мы можем работать с ними только как с User.
     * Например, вызвать toString()
     */

//    objs.add(new Applicant("appl1"));
//    objs.add(new Employer("appl1"));
//    objs.add(new User("user"));
//    objs.add(new Object());

    for (User user: objs) {
      System.out.println(user.getClass().getName());
      System.out.println(user.getName());
    }
  }
}
