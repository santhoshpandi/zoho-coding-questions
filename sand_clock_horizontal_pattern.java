
package zoho;

import java.util.Scanner;

/**
9
*               * 
* *           * * 
*   *       *   * 
*     *   *     * 
*       *       * 
*     *   *     * 
*   *       *   * 
* *           * * 
*               * 
 */
public class sand_clock_horizontal_pattern {
     public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==i||j==n-i+1||j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
