public class Main {
  public static void main(String[] args) {
    Address address = new Address("London");
    Person person = new Person("Jhon", "Doe", address);
    System.out.println(person.toString() + person.getAddress().getCity());

    address.setCity("New-York");
    System.out.println(person.toString() + person.getAddress().getCity());

    Address cityPerson = person.getAddress();
    cityPerson.setCity("California");
    System.out.println(person.toString() + person.getAddress().getCity());
  }
}