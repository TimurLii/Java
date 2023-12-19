package youtube.oop.Cat;

public class OOP_1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", 10, "Petr");
//        System.out.println(cat.ownerName);
//        System.out.println(cat);
//        System.out.println(cat);
//        cat.color = "Red";
        cat.destroySofa("Петра");
        String animal = cat.hunt(false);
        System.out.println(animal);
    }
}
