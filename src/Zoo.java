public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }

    public void displayZoo(){
        System.out.println("Zoo :" + name);
        System.out.println("Ville :" + city);
        System.out.println("Nombre de cages :" + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        // Condition 1 : vérifier si le zoo est plein
        if (nbrAnimals >= nbrCages) {
            System.out.println("Impossible d'ajouter " + animal.name + " : le zoo est plein !");
            return false;
        }

        // Condition 2 : vérifier si l'animal existe déjà (par nom)
        if (searchAnimal(animal) != -1) {
            System.out.println("Impossible d'ajouter " + animal.name + " : animal déjà présent !");
            return false;
        }

        // Ajouter l'animal
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Impossible de supprimer " + animal.name + " : animal non trouvé !");
            return false;
        }
        for (int i = index; i<nbrAnimals -1; i++) {
            animals[i]=animals[i+1];
        }
        animals[nbrAnimals - 1 ]=null;
        nbrAnimals--;
        System.out.println(animal.name + " a ete supprimé avec succes ");
        return true;
    }

    public void displayAnimals(){
        System.out.println("Animals du zoo :");
        for (int i=0;i<nbrAnimals;i++){
            System.out.println("- " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0;i<nbrAnimals;i++){
            if(animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        return "Zoo[name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }

}
