public class Employee {
    private String name;
    private int ID,age;
    private double salary;
    public Employee() {}
    public Employee(String name, int ID, int age, double salary) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
