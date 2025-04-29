package Java;
import java.util.*;
public class Person {
    public String name;
    public int age;
    public void display(){
            
        System.out.println("Your Name is :- "+name+"\nYour Age is :- "+age);
    }
    public static void main(String []args ){
        Scanner sc= new Scanner(System.in);
        Person p =new Person();
        Person p2 =new Person();
        System.out.print("Enter Your  First Person Name :- ");
        p.name=sc.next();
        System.out.print("Enter Your First Person Age :- ");
        p.age=sc.nextInt();
        p.display();
        Person p1 = new Person();
        System.out.println("");
        System.out.print("Enter Your Second Person  Name :- ");
        p1.name=sc.next();
        System.out.print("Enter Your Second Person Age :- ");
        p1.age=sc.nextInt();
        p1.display();
        System.out.print("Enter Your Third Person Name :- ");
        p2.name=sc.next();
        System.out.print("Enter Your Third Person Age :- ");
        p2.age=sc.nextInt();
        p2.display();
        
    }
}
