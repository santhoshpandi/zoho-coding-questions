
package zoho;
import java.util.*;
/**
 * Input:
7
1 9 7 36 91 101 46
* output:
7 36 36 46 101 -1 -1
* 
*  * Input:
5
2 -1 0 -1 3
* output:
3 0 3 3 -1
 */
public class replace_next_greatest_value {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> t = new ArrayList<>();
        for(int i=0;i<n;i++)
            a[i]=c.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
                t.add(a[j]);
            Collections.sort(t);
            boolean f=true;
            for(int j:t)
            {
                if(j>a[i])
                {
                    a[i]=j;
                    f=false;
                    break;
                }                    
            }
            if(f) a[i]=-1;
            t.clear();
        }
        
        for(int i:a)
            System.out.print(i+" ");
    }
}
