/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;

/**
9
8
* Output:
72
 */
public class mulitiply_using_plus_operator {
    public static int multiply(int a,int b)
    {
        int ans=0;
        for(int i=1;i<=b;i++)
            ans+=a;
        return ans;
    }
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
        System.out.println(multiply(a,b));
    }
}
