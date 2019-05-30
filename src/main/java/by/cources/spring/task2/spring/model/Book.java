package by.cources.spring.task2.spring.model;

public class Book {

  private Long id;
  private String name;
  private Long id_autor;
  private long year;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  public Long getIdAutor() {
    return id_autor;
  }

  public void setIdAutor(Long id_autor) { this.id_autor = id_autor; }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) { this.year = year; }

  @Override
  public String toString() {
    return "Book{id=" + id + ", name='" + name + "\'}";
  }
}