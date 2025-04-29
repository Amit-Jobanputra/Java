
package Java;
import java.util.*;
public class Home_work {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows :- ");
        int a = sc.nextInt();
        int[][]num= new int[a][];
        for(int x =0 ;x<a;x++)
        {
            num[x]=new int[x+1];
        }
        for(int i=0 ;i<a;i++)
        {
            int b= 65;
            for(int j=0;j<=i;j++)
            {
                num[i][j]=b++;
                System.out.print((char)num[i][j] + " ");     
            }
            System.out.println("");
        }
    }
}
