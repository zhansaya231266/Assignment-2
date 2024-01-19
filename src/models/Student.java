package models;

public class Student extends Person {
    private static int id;
    private String name;
    private String surname;
    public double gpa;
    public String toString(){
        return "models.Student: " + id + ". " + name + " " + surname;
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
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(){
        this.name = "";
        this.surname = "";
        this.gpa = 0.0d;
    }
    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public double getPaymentAmount(){
        if (gpa > 2.67){
            return 36660.00;
        }else{
            return 0.00;
        }
    }
}
