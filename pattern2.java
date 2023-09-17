/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;

/**
6
                1 
             2  3 
          4  5  6 
       7  8  9 10 
   11 12 13 14 15 
16 17 18 19 20 21 
 */
public class pattern2 {
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int cnt=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.printf("%2d ",cnt++);
            System.out.println();
        }
    }
}
