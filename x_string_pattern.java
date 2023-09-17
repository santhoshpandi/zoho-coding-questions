/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;

/**
geeksforgeeks
* output:
g           s
 e         k 
  e       e  
   k     e   
    s   g    
     f r     
      o      
     f r     
    s   g    
   k     e   
  e       e  
 e         k 
g           s
 */
public class x_string_pattern {
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        String s = c.next();
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(j==i||j==s.length()-i-1)
                    System.out.print(s.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
