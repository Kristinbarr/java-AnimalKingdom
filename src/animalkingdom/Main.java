package animalkingdom;

import java.util.*;

public class Main {

  // create a method takes a lambda(in separate file). it will filter w 2 args.
  // call it down below.
  // static bc it's used within a class, void bc it's not returning anything
  public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
    for (AbstractAnimal a : animals) {
      if (tester.test(a)) {
        System.out.println(
            "Name: " + a.getName() +
            ", species: " + a.getClass().getSimpleName() +
            ", named in: " + a.getYear() +
            ", movement: " + a.move() +
            ", breaths with: " + a.breath() +
            ", reproduces by: " + a.reproduce());
      }
    }
  }

  public static void main(String[] args) {

    // mammals
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);
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

    // an ArrayList must have one data type and all animals share AbstractAnimal
    ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);
    System.out.println();

    System.out.println("Animal List");
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("___ All Animals by descending year named ___");
    animalList.sort((a1, a2) -> a1.getYear() - a2.getYear());
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("___ All Animals alphabetically ___");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("___ All Animals by how they move ___");
    animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    animalList.forEach((a) -> System.out.println(a + " move: " + a.move()));
    System.out.println();

    System.out.println("___ Only Animals that breath with lungs ___");
    printAnimals(animalList, (a -> a.breath().equals("lungs")));
    System.out.println();

    System.out.println("___ Only Animals that breath with lungs and named in 1758 ___");
    printAnimals(animalList, (a -> a.getYear() == 1758));
    System.out.println();

    System.out.println("___ Only Animals that breath with lungs and lay eggs ___");
    printAnimals(animalList, (a -> a.breath().equals("lungs") && a.reproduce().equals("eggs")));
    System.out.println();

    System.out.println("___ Only Animals alphabetically and named in 1758 ___");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalList, (a -> a.getYear() == 1758));
    System.out.println();

    System.out.println("___ STRETCH: Only Animals that are mammals alphabetically ___");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalList, (a -> a instanceof Mammal));
    System.out.println();

  }
}
