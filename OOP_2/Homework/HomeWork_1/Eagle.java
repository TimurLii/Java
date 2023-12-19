package OOP_2.Homework.HomeWork_1;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal {//extends обозначает наследование от какого-то класса
    private boolean fly;
    private boolean swim;
    private boolean toGo;

    public Eagle(String name, LocalDate birthDay,
                 List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
        this.fly = true;
        this.swim = false;
        this.toGo = true;
    }

    public boolean flying() {
        return true;
    }

    public boolean swims() {
        return false;
    }

    public boolean toGoing() {
        return true;
    }

}
