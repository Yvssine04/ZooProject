import java.util.Scanner;

public class ZooManagement {

    /*
    int nbrCages = 20;
    String zooName = "my zoo";
     */



    public static void main(String[] args){


        Animal lion =new Animal("felidae", "simba",5 ,true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);

        Zoo myZoo = new Zoo("Safari park","tunis",25);

        myZoo.displayZoo();

        System.out.println(); //sauter une ligne

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        // Ajout des animaux au tableau du zoo
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = crocodile;

        /*
        Animal lion = new Animal();
        lion.name = "simba";
        lion.family="felidae";
        lion.age=5;
        lion.isMammal=true;

        Zoo myZoo = new Zoo();
        myZoo.name="safari park";
        myZoo.city="tunis";
        myZoo.nbrCages=25;
        myZoo.animals[0]=lion;
         */


        /*
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName= sc.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages=sc.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        sc.close();
    }

}
