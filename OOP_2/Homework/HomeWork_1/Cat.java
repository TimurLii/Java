package OOP_2.Homework.HomeWork_1;

import java.util.List;
import java.time.LocalDate;

public class Cat extends Animal {
    private int legsCount;
    private boolean fly;
    private boolean swim;
    private boolean toGo;

    public Cat(String name, LocalDate birthDay,
               List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount = legsCount;
        this.fly = false;
        this.swim = false;
        this.toGo = true;
    }

    public int getLegsCount() {
        return legsCount;
    }
    public boolean flying() {
        return false;
    }

    public boolean swims() {
        return false;
    }

    public boolean toGoing() {
        return true;
    }
}