package OOP_2.Seminar.Sem_1;


public class Employee {

    private long id;
    private String name;
    private int countOfChildren;
    private double salary;
    private Adress adress;

    public Employee(String name, double salary) {

        this(name);
        this.salary = salary;
    }
    public Employee(String name) {
        this.name = name;

    }

    public String getName() {


        return name ;
    }
}
