package animalkingdom;

public class Mammal extends AbstractAnimal {

  public Mammal(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return "walk";
  }

  @Override
  public String breath() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "live-births";
  }

  @Override
  public String toString() {
    return "Mammal " + "Name: " + name + "\'" + ", Year Named: " + year;
  }
}
