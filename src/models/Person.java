package models;

public class Person implements Payable, Comparable<Person>{
    private static int id;
    private String name;
    private String surname;
    private String position;
    public String toString(){
        return id + ". " + name + " " + surname;

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
    public Person(){
        this.name = "";
        this.surname = "";
    }
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getPosition(){
        return position;
    }
    public double getPaymentAmount(){
       return 0.0;
    }
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
