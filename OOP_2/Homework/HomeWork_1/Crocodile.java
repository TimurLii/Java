package OOP_2.Homework.HomeWork_1;

import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal {
    private boolean fly ;
    private boolean swim;
    private boolean toGo;

    public Crocodile(String name, LocalDate birthDay,
                     List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
        this.fly = false;
        this.swim = true;
        this.toGo = true;

    }
    public boolean flying(){
        return false;
    }
    public boolean swims(){
        return true;
    }
    public boolean toGoing(){
        return true;
    }


}
