package ru.hh.school.collection.stream.example.create;

public class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getType() {
    return "user";
  };

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name;
  }
}
