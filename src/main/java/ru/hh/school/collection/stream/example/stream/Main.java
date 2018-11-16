package ru.hh.school.collection.stream.example.stream;

import ru.hh.school.collection.stream.example.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] str) {
    System.out.println(new CollectionWithoutStream().getVacanciesWithSalaryMore50000(getVacancies()));
    System.out.println(new CollectionStream().getVacanciesWithSalaryMore50000(getVacancies()));
    System.out.println(new CollectionStreamEx().getVacanciesWithSalaryMore50000(getVacancies()));
  }

  private static List<Vacancy> getVacancies() {
    List<Vacancy> vacancies = new ArrayList<>();
    vacancies.add(new Vacancy(1, "Программист java", 100_000));
    vacancies.add(new Vacancy(2, "Программист php", 101_000));
    vacancies.add(new Vacancy(3, "Программист scala", 150_000));
    vacancies.add(new Vacancy(4, "Программист sql", 60_000));
    vacancies.add(new Vacancy(5, "Программист LabView", 30_000));
    vacancies.add(new Vacancy(6, "Программист C++", 111_000));
    vacancies.add(new Vacancy(7, "Программист pascal", 50_000));
    return vacancies;
  }
}
