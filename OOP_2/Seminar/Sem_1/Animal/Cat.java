package OOP_2.Seminar.Sem_1.Animal;

import java.util.List;
import java.time.LocalDate;

public class Cat extends Animal {
    private int legsCount;

    public Cat(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
}
