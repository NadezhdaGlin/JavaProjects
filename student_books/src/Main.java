import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main  {
  public static void main(String[] args) throws IOException{

    List<Student> students = Files.lines(Paths.get("../students_and_books.txt"))
      .map(line -> {
          String[] parts = line.split(";");
          String name = parts[0];

          List<Book> books = Arrays.stream(parts[1].split("\\|"))
                            .map(bookStr -> {
                                String[] bookData = bookStr.split(",");
                                String title = bookData[0];
                                int pages = Integer.parseInt(bookData[1]);
                                int year = Integer.parseInt(bookData[2]);

                                return new Book(title, pages, year);
                            })
                            .collect(Collectors.toList());

          return new Student(name, books);
      }).collect(Collectors.toList());

      students.forEach(System.out::println);

      students.stream()
        .peek(student -> System.out.println("Студент: " + student.getName()))
        .flatMap(student -> student.getBooks().stream())
        .sorted()
        .distinct()
        .filter(book -> book.getYear() > 2000)
        .limit(3)
        .map(Book::getYear)
        .findFirst()
        .ifPresentOrElse(
                year -> System.out.println("Год выпуска найденной книги: " + year),
                () -> System.out.println("Такая книга отсутствует")
        );
  }
}
