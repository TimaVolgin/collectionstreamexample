package ru.hh.school.collection.stream.example.create;

import ru.hh.school.collection.stream.example.dto.Applicant;
import ru.hh.school.collection.stream.example.dto.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Можем ли мы сделать так: List<Object> list = new ArrayList<Integer>(); ?
 */
public class Create1GenericCollection {

  public static void main(String [] str) {
    createListFromOtherList();
  }

  private static void createListFromOtherList() {
    List<Applicant> intList1 = new ArrayList<>();
    intList1.add(new Applicant("appl1"));
    intList1.add(new Applicant("appl2"));

    System.out.println(intList1);

    List<Applicant> intList2 = intList1;
    intList2.add(new Applicant("appl3"));

    System.out.println(intList2);
    System.out.println(intList1);
//    List<User> applicants = new ArrayList<Applicant>();
  }







  private static void differentTypesLists() {
    // Create a List of Applicant objects
    List<Applicant> applicants = new ArrayList<>();

    // Добавляем соискателя без проблем
    applicants.add(new Applicant("appl1"));

    // Ошибка
//    List<User> objs = applicants;

    // Потому что если бы ошибки не было, мы бы смогли сделать так:
//    objs.add(new Employer("empl1"));

    // и мы бы получили работодателя в списке соискателей
  }
}
