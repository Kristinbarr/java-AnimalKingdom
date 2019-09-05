package animalkingdom;

// abstract classes force child class to inherit specified information
public abstract class AbstractAnimal {

  private static int maxId = 0;
  private int id;
  String name;
  int year;

  // All animals consume food the same way

  // Each animal is assigned a unique number, a name, and year discovered
  // regardless of classification.

  // Methods will return a string saying how that animal implements the action

  // All animals can move, breath, reproduce. How they do that, so what string should get returned when the method is executed, varies by animal type.

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
