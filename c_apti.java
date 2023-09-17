
package zoho;
import java.util.*;
public class c_apti {
    public static boolean a(String s)
    {
        return s.matches("[a-z0-9]+");
    }
    public static void main(String[] args)
    {
        int[] a ={1,2,3,4,5,6,7,8};
        String ans="";
        Arrays.sort(a);
        for(int i:a)
            ans=ans+i;
        while(!ans.equals(""))
        {
            if(ans.length()>1)
                System.out.print(ans.charAt(ans.length()-1)+",");
            System.out.print(ans.charAt(0)+",");
            if(ans.length()>1)
                ans=ans.substring(1,ans.length()-1);
            else
                ans=ans.substring(1);
        }
            
    }
}
