package animalkingdom;

// abstract classes force child class to inherit specified information
public abstract class AbstractAnimal {

  private static int maxId = 0;
  private int id;
  String name;
  int year;

  public AbstractAnimal(String name, int year) {
    maxId++;
    id = maxId;
    this.name = name;
    this.year = year;
  }

  public String eat() {
    return "food";
  }

  public abstract String move();

  public abstract String breath();

  public abstract String reproduce();

  // getter functions
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

}
