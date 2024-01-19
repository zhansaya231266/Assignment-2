package models;

public class Employee extends Person {
    private static int id;
    private String name;
    private String surname;
    private String position;
    private double salary;
    public String toString(){
        return "models.Employee: " + id + ". " + name + " " + surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId(){
        return id;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(){
        this.name = "";
        this.surname = "";
        this.position = "";
        this.salary = 0.0d;
    }
    public Employee(String name, String surname, String position, double salary){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }
    public double getPaymentAmount(){
        return salary;
    }
}
