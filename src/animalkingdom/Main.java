package animalkingdom;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // mammals
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoor", 2021);
    // Birds
    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);
    // Fish
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    System.out.println(panda);
    System.out.println(zebra);
    System.out.println(koala);
    System.out.println(sloth);
    System.out.println(armadillo);
    System.out.println(raccoon);
    System.out.println(bigfoot);
    System.out.println(pigeon);
    System.out.println(peacock);
    System.out.println(toucan);
    System.out.println(parrot);
    System.out.println(swan);
    System.out.println(salmon);
    System.out.println(catfish);
    System.out.println(perch);

    // make an arraylist to add
    // arrayLists can only have one data type
  }
}
