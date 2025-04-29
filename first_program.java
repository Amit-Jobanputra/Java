
package Java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.util.*;
public class first_program {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Integer Number :-");
        long a =sc.nextLong();
        String str = String.valueOf(a);
        StringBuilder strb= new StringBuilder();
        
        for(int i=0;i<str.length();i++)
        {
            char digit =(str.charAt(i));
            String word =" ";
            if(digit=='0')
                word="Zero";
            else if(digit=='1')
                word="One";
            else if(digit=='2')
                word="Two";
            else if(digit=='3')
                word="Three";
            else if(digit=='4')
                word="Four";
            else if(digit=='5')
                word="Five";
            else if(digit=='6')
                word="Six";
            else if(digit=='7')
                word="Seven";
            else if(digit=='8')
            {
                word="Eight";
            }
            else if(digit=='9')
            {
                word="Nine";
            }
            else
                word="there is No Number Found ";
            strb.append(word).append(" ");
        }
        System.out.println(strb.toString());
     }
}
