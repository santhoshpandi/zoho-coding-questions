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
public class number_of_grandchildrn {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int m=c.nextInt();
        String[][] f = new String[m][2];
        int cnt=0;
        ArrayList<String> p = new ArrayList<String>();
        for(int i=0;i<m;i++)
            for(int j=0;j<2;j++)
                f[i][j]=c.next();
        System.out.println("Enter GrandParent name: ");
        String gp = c.next();
        for(int i=0;i<m;i++)
        {
            if(f[i][1].equals(gp)) p.add(f[i][0]);
        }
        for(int i=0;i<p.size();i++)
        {
            for(int j=0;j<m;j++)
                if(f[j][1].equals(p.get(i))) cnt++;
        }
        System.out.println(cnt);
    }
    
}
