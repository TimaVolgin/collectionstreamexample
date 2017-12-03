package ru.hh.school.collection.stream.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStream implements CollectionExample {
  @Override
  public List<Integer> getVacanciesWithSalaryMore50000(List<Vacancy> vacancies) {
    return vacancies.stream()
        .filter(vacancy -> vacancy.getSalary()/100*87 >= 50000)
        .sorted(Comparator.comparing(Vacancy::getSalary))
//        .map(vacancy -> vacancy.getId())
        .map(Vacancy::getId)
        .limit(3)
        .collect(Collectors.toList());
  }
}
