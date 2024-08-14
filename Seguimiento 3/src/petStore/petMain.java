package petStore;

public class petMain {
    public static void main(String[] args) {
        pet pet1 = new pet("Sasha", 2, "Pitbull", "Black");
        pet pet2 = new pet("Francis", 3, "Golden Retriever", "Gold");
        pet pet3 = new pet("Bolt", 4, "White Swiss Shepherd", "White");
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        pet1.setName("Venus");
        System.out.println(pet1);
    }
}
