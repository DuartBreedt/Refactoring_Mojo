package za.co.entelect.mojo.a.single.responsibility.solution;

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
