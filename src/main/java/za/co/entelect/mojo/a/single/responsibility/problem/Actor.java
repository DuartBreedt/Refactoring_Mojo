package za.co.entelect.mojo.a.single.responsibility.problem;

public class Actor {
    private String name;
    private double salary;

    public Actor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
