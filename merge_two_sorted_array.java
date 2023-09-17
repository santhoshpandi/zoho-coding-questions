/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;
/**
 *
 * @author Santhosh Pandi
 */
public class merge_two_sorted_array {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        
        int m = c.nextInt();
        int[] a = new int[m];        
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<m;i++)
        {
            a[i]=c.nextInt();
            s.add(a[i]);
        }
        
        int n = c.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=c.nextInt();
            s.add(b[i]);
        }
        
        for(int i:s)
            System.out.print(i+" ");
    }
}
