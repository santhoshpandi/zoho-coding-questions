/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Hollow_Diamond {
    
    public static void print(int i,int n)
    {
        for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
    }
    
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for(int i=1;i<=n;i++)
        {
            print(i,n);
        }
        for(int i=n-1;i>=1;i--)
        {
            print(i,n);
        }
        
        
    }
    
}
