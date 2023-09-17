/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho;
import java.util.*;

/**
5
12345
23451
34512
45123
51234
 */
public class pattern1 {
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        String ans="";
        for(int i=1;i<=n;i++)
            ans=ans+i;
        for(int i=1;i<=n;i++)
        {
            System.out.println(ans);
            ans=ans+ans.charAt(0);
            ans=ans.substring(1,ans.length());
        }
    }
}
