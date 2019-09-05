package animalkingdom;

public class Bird extends AbstractAnimal {

  private int food; // not sure here

  public Bird(int id, String name, int year) {
    super(id, name, year, food);
    this.id = id;
    this.name = name;
    this.year = year;
  }

  public String move() {
    return "fly";
  }

  public String breath() {
    return "lungs";
  }

  public String reproduce() {
    return "eggs";
  }
}
