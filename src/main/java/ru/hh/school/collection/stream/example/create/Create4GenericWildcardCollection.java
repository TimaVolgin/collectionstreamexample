package ru.hh.school.collection.stream.example.create;

import java.util.*;

public class Create4GenericWildcardCollection {

  public static void main(String[] str) {
    List<User> kennel = new ArrayList<>();

    kennel.add(new Applicant("appl1"));
    kennel.add(new Employer("empl2"));

    List<? super Applicant> objs = kennel;

//    objs.add(new Applicant("appl2"));
//    objs.add(new Employer("empl1"));
//    objs.add(new Object());

    for (Object user: objs) {
      System.out.println(user.getClass().getName());
      System.out.println(user);
    }
  }
}
