package ru.hh.school.collection.stream.example.stream.calc_salary;

import one.util.streamex.StreamEx;
import ru.hh.school.collection.stream.example.dto.Vacancy;

import java.util.List;

public class CollectionStreamEx implements CollectionExample {
  @Override
  public List<Integer> getVacanciesWithSalaryMore50000(List<Vacancy> vacancies) {
    return StreamEx.of(vacancies)
        .filter(vacancy -> vacancy.getSalary()/100*87 >= 50000)
        .sortedBy(Vacancy::getSalary)
        .map(Vacancy::getId)
        .limit(3)
        .toList();
  }
}
