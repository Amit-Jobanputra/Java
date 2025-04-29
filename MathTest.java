package Java;
import MathPack.Mathdemo;
public class MathTest {
    public static void main(String[] args) {
        Mathdemo md = new Mathdemo();
        int a=md.add(10, 20);
        int b = md.sub(30, 20);
        System.out.println("Addition is :- "+a);
        System.out.println("Subtraction is :- "+b);
    }
}
