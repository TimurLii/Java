package OOP_2.Seminar.Sem_1.Animal;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{//extends обозначает наследование от какого-то класса
    public Eagle(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

}
