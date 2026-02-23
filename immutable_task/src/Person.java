public final class Person  {
  private final String name;
  private final String surname;
  private Address address;
    
  public Person(String name, String surname, Address address) {
    this.name = name;
    this.surname = surname;
    this.address = new Address(address);
  }
  
  public String getName() {
    return name;
  }
  
  public String getSurname() {
    return surname;
  }
  
  public Address getAddress() {
    return new Address(address);
  }
  
  public String toString()
  {
    return name + " " + surname + " ";
  }
}
