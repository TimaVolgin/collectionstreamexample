package ru.hh.school.collection.stream.example.create;

public class Applicant extends User {

  public Applicant(String name) {
    super(name);
  }

  @Override
  public String getType() {
    return "applicant";
  }
}
