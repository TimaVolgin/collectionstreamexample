package ru.hh.school.collection.stream.example.create;

import java.util.ArrayList;
import java.util.List;

public class Create1GenericCollection {

  public static void main(String [] str) {
    integersLists();
  }

  private static void integersLists() {
    List<Applicant> intList1 = new ArrayList<>();
    intList1.add(new Applicant("appl1"));
    intList1.add(new Applicant("appl2"));

    System.out.println(intList1);

    List<Applicant> intList2 = intList1;
    intList2.add(new Applicant("appl3"));

    System.out.println(intList2);
    System.out.println(intList1);
  }






  private static void differentTypesLists() {
    // Create a List of Applicant objects
    List<Applicant> applicants = new ArrayList<>();

    // Adding a Applicant is no problem
    applicants.add(new Applicant("appl1"));

    // The following line results in a compiler error
//    List<User> objs = applicants;

    // Because if it were allowed, we could do this
//    objs.add(new Employer("empl1"));

    // And now we've got a String in our List of Integer
  }
}
