package ru.hh.school.collection.stream.example.create;

public abstract class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  abstract String getType();

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
