import java.util.*;
public class Test {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        Exam[] e1 = new Exam[5];
        for(int i=0;i<5;i++){
           if(i>=1){ 
            sc.nextLine();}
        System.out.print("Enter Your Name :- ");
        String nm=sc.nextLine();
        System.out.print("Enter Your Surname :- ");
        String snm=sc.nextLine();
        System.out.print("Enter Your Enrollment Number :- ");
        String eno=sc.next();
        System.out.print("Enter Your Division :- ");
        String div=sc.next();
        System.out.print("Enter Your CIA-1 Marks :- ");
        int cia1=sc.nextInt();
        System.out.print("Enter Your CIA-2 Marks :- ");
        int cia2=sc.nextInt();
        System.out.println("\n");
        e1[i]=new Exam(cia1,cia2,eno,div,nm,snm);
            System.out.println("");
        }
        for(int j =0 ;j<5;j++)
        {
            System.out.println("");
            System.out.println("Student Details for :-"+j+1);
            e1[j].dislpayAll();
        }
   }
}
