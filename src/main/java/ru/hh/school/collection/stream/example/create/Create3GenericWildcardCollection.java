package ru.hh.school.collection.stream.example.create;

import java.util.ArrayList;
import java.util.List;

public class Create3GenericWildcardCollection {

  public static void main(String[] str) {
    List<Applicant> applicants = new ArrayList<>();

    applicants.add(new Applicant("appl1"));

    List<? extends User> objs = applicants;

//    objs.add(new Applicant("appl1"));
//    objs.add(new Employer("appl1"));
//    objs.add(new User("user"));

    for (User user: objs) {
      System.out.println(user.getClass().getName());
      System.out.println(user.getName());
    }
  }
}
