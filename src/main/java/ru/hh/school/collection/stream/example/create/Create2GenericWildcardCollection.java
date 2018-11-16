package ru.hh.school.collection.stream.example.create;

import java.util.ArrayList;
import java.util.List;

public class Create2GenericWildcardCollection {

  public static void main(String[] args) {
    List<Applicant> applicants = new ArrayList<>();

    applicants.add(new Applicant("appl1"));

    List<?> objs = applicants;

    /*
     * But now we can't make any assumptions about the type of
     * objects in the objs List. In fact, the only thing that
     * we can safely do with them is treat them as Objects.
     * For example, implicitly invoking toString() on them.
     */

//    objs.add(new Applicant("appl2"));
//    objs.add(new Employer("appl2"));
//    objs.add(new Object());
//    objs.add(new User("user"));

    for (Object obj : objs) {
      System.out.println(obj.getClass().getName());
      System.out.println(obj);
    }
  }
}
