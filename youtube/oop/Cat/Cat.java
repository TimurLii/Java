package youtube.oop.Cat;

public class Cat {
    String color;
    double weight;
    String ownerName;

    public Cat(String colorname, double weightCat, String owner) {
        this.color = colorname;
        this.weight = weightCat;
        this.ownerName = owner;

    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерёт диван %s!\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";
        }
        return "Сова";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
