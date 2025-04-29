package Java;

import java.util.*;
public class Calculator {
    float a,b;
    public void Addition(float num1 ,float num2)
    {
        System.out.println("Addition is :-"+(num1+num2));
    }
    public void Subtraction(float num1 ,float num2)
    {
        System.out.println("Subtraction is :-"+(num1-num2));
    }
    public void Multiplication(float num1 ,float num2)
    {
        System.out.println("Multiplication is :-"+(num1*num2));
    }
    public void Division(float num1 ,float num2)
    {
        System.out.println("Division is :-"+(num1/num2));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        c.a=sc.nextFloat();
        c.b=sc.nextFloat();
        c.Addition(c.a, c.b);
        c.Subtraction(c.a, c.b);
        c.Multiplication(c.a, c.b);
        c.Division(c.a, c.b);
    }
}
