package Java;
public class Person1 {
    String name;
    String surname;

    public Person1() {
    }

    public Person1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    void setData(String name ,String surname){
        this.name =name;
        this.surname = surname;
    }
    void display(){
        System.out.println("Name :- "+name+" "+surname);
    }
    
}
