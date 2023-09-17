/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;

/**
 * Input:
4
20 30 120 240 
* Output:
[30,20]
* 
*  * Input:
4
5 4 3 2
* Output:
[3,2]
[4,3]
[5,4]
 */
public class smallest_absolute_difference {
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=c.nextInt();
        Arrays.sort(a);
        int diff=9999;
        for(int i=1;i<n;i++)
            if((a[i]-a[i-1])<diff) diff=a[i]-a[i-1];
        for(int i=1;i<n;i++)
            if((a[i]-a[i-1])==diff) System.out.println("["+a[i]+","+a[i-1]+"]");
    }
}
