package ru.hh.school.collection.stream.example;

import java.util.List;

public interface CollectionExample {
  // Вернуть список идентификаторов вакансий,
  // у которых зарплата с вычетом процентов больше 50000, сортирует по убыванию зарплаты и возвращаем первые 3
  List<Integer> getVacanciesWithSalaryMore50000(List<Vacancy> vacancies);
}
