/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;
/**
5
    1
   21
  321
 4321
54321
 */
public class pattern_123 {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
    }
}

