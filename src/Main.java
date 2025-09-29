public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal lion2 = new Animal("Feline", "Lion", 3, true); // même nom que lion

        // Tester l'ajout
        System.out.println(myZoo.addAnimal(lion));     // true
        System.out.println(myZoo.addAnimal(tiger));    // true
        System.out.println(myZoo.addAnimal(elephant)); // true
        System.out.println(myZoo.addAnimal(lion2));    // false, déjà présent
        System.out.println(myZoo.addAnimal(new Animal("Primate", "Monkey", 2, true)));

        System.out.println();

        myZoo.removeAnimal(tiger);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, true);
        myZoo.removeAnimal(giraffe);


        System.out.println();
        myZoo.displayZoo();
        myZoo.displayAnimals();
    }
}
