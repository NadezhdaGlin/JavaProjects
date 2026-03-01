import java.util.Objects;

public class Book implements Comparable<Book>{
  private String title;
  private int pages;
  private int year;
  
  public Book(String title, int pages, int year) {
    this.title = title;
    this.pages = pages;
    this.year = year;
  }
  
  public int getPages() {
    return pages;
  }
  
  public int getYear() {
    return year;
  }

  public int compareTo(Book other) {
    return Integer.compare(this.pages, other.pages);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book book = (Book) o;
    return pages == book.pages &&
           year == book.year &&
           Objects.equals(title, book.title);
  }

  public int hashCode() {
    return Objects.hash(title, pages, year);
  }

  public String toString() {
    return "(" + title + ", " + pages + " pages, " + year + ")";
  }
}
