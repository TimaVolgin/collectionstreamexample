package ru.hh.school.collection.stream.example.create;

import java.util.ArrayList;
import java.util.List;

public class Create3GenericWildcardCollection {

  public static void main(String[] str) {
    List<Applicant> kennel = new ArrayList<>();

    kennel.add(new Applicant("appl1"));

    List<? extends User> objs = kennel;

//    objs.add(new Applicant("appl1"));
//    objs.add(new Employer("appl1"));

    for (User user: objs) {
      System.out.println(user.getClass().getName());
      System.out.println(user.getName());
    }
  }
}
