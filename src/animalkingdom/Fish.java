package animalkingdom;

public class Fish extends AbstractAnimal {

  private int food; // not sure here

  public Fish(int id, String name, int year) {
    super(id, name, year);
    this.id = id;
    this.name = name;
    this.year = year;
  }

  public String move() {
    return "swim";
  }

  public String breath() {
    return "gills";
  }

  public String reproduce() {
    return "eggs";
  }

}
