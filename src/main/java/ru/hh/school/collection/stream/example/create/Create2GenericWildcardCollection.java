package ru.hh.school.collection.stream.example.create;

import ru.hh.school.collection.stream.example.dto.Applicant;
import ru.hh.school.collection.stream.example.dto.Employer;
import ru.hh.school.collection.stream.example.dto.User;

import java.util.ArrayList;
import java.util.List;

public class Create2GenericWildcardCollection {

  public static void main(String[] args) {
    List<Applicant> applicants = new ArrayList<>();

    applicants.add(new Applicant("appl1"));

    List<?> objs = applicants;

    /*
     * Но теперь мы не можем делать никаких предположений о типе объектов в списке.
     * Мы можем работать с ними только как с Objects.
     * Например, вызвать toString()
     */

//    objs.add(new Applicant("appl2"));
//    objs.add(new Employer("appl2"));
//    objs.add(new Object());
//    objs.add(new User("user"));

    for (Object obj : objs) {
      System.out.println(obj.getClass().getName());
//      System.out.println(obj.getType());
      System.out.println(obj);
    }
  }
}
