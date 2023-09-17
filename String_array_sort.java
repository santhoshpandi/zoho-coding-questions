/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;
/**
 *
 * @author USER
 */
public class String_array_sort {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        String[] ar = new String[n];
        for(int i=0;i<n;i++)
            ar[i]=c.next();
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(ar[i].compareTo(ar[j])>0)
                {
                    String temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        
        //Arrays.sort(ar);
        
        for(String ans:ar)
            System.out.print(ans+" ");
    }
}
