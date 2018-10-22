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






  // List<Object> list = new ArrayList<Integer>();
  private static void differentTypesLists() {
    // Create a List of Integer objects
    List<Applicant> kennel = new ArrayList<>();

    // Adding a int is no problem
    kennel.add(new Applicant("appl1"));

    // The following line results in a compiler error
//    List<User> objs = kennel;

    // Because if it were allowed, we could do this
//    objs.add(new Employer("empl1"));

    // And now we've got a String in our List of Integer
  }
}
