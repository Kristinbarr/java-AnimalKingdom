package animalkingdom;

public class Mammal extends AbstractAnimal {

  public Mammal(int id, String name, int year) {
    super(id, name, year);
  }

  public String move() {
    return "walk";
  }

  public String breath() {
    return "lungs";
  }

  public String reproduce() {
    return "live-births";
  }

}
