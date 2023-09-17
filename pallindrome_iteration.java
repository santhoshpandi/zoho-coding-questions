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
public class pallindrome_iteration {
    public static int reverse(int n)
    {
        int num=0;
        for(;n>0;n=n/10)
        {
            num=(num*10)+(n%10);
        }
        return num;
    }
    public static boolean check_pallindrome(int n)
    {
        if(reverse(n)==n)
            return true;
        else 
            return false;
    }
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n=c.nextInt();
        int iteration=0;
        while(!check_pallindrome(n)&&iteration<=5)
        {
            System.out.print(n+" + "+reverse(n)+" = ");
            n=n+reverse(n);
            System.out.println(n);
            iteration++;
        }
        System.out.println("Stop");
        
    }
}
