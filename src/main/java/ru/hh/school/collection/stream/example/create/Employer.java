package ru.hh.school.collection.stream.example.create;

public class Employer extends User {

  public Employer(String name) {
    super(name);
  }

  @Override
  public String getType() {
    return "employer";
  }
}
