public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    //constructeur parametre
    public Animal(String family, String name, int age, boolean isMammal){
        this.family =family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return name + " (" + family + "), âge " + age + ", mammifère : " + isMammal;
    }
}
