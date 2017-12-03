package ru.hh.school.collection.stream.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] str) {
    CollectionExample col = new CollectionStreamEx();
    System.out.println(col.getVacanciesWithSalaryMore50000(getVacancies()));
  }

  private static List<Vacancy> getVacancies() {
    List<Vacancy> vacancies = new ArrayList<>();
    vacancies.add(new Vacancy(1, "Программист java", 100000));
    vacancies.add(new Vacancy(2, "Программист php", 101000));
    vacancies.add(new Vacancy(3, "Программист scala", 150000));
    vacancies.add(new Vacancy(4, "Программист sql", 60000));
    vacancies.add(new Vacancy(5, "Программист LabView", 30000));
    vacancies.add(new Vacancy(6, "Программист C++", 111000));
    vacancies.add(new Vacancy(7, "Программист pascal", 50000));
    return vacancies;
  }
}
