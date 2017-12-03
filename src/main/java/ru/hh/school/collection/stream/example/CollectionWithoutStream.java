package ru.hh.school.collection.stream.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionWithoutStream implements CollectionExample {
  @Override
  public List<Integer> getVacanciesWithSalaryMore50000(List<Vacancy> vacancies) {
    List<Vacancy> retVacancies = new ArrayList<>();
    for (Vacancy vacancy: vacancies) {
      if (vacancy.getSalary()/100*87 >= 50000) {
        retVacancies.add(vacancy);
      }
    }

    retVacancies.sort(new Comparator<Vacancy>() {
      @Override
      public int compare(Vacancy o1, Vacancy o2) {
        return o1.getSalary().compareTo(o2.getSalary());
      }
    });

    List<Integer> vacanciesId = new ArrayList<>();
    for (Vacancy vacancy: retVacancies) {
      vacanciesId.add(vacancy.getId());
    }

    return vacanciesId.subList(0, 3);
  }
}
