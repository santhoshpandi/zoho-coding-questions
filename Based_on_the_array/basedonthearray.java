import java.util.*;
import java.lang.*;
class basedonthearray{
	public static void main (String[] args)
	{
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int count_positive=0;
		int count_negative=0;
		int count_neutral=0;
		int[] numbers = new int[n];
		for(int i=0;i<n;i++)
			numbers[i]=c.nextInt();
		for(int i=0;i<n;i++)
		{
			if(numbers[i]>0)
			{
				count_positive+=1;
				
			}
			else if(numbers[i]==0)
			{
				count_neutral+=1;
			}
			else
			{
				count_negative+=1;

			}
		}
		float p=(float)count_positive/n;
		float pn=(float)count_neutral/n;
		float nn=(float)count_negative/n;
		System.out.format("%.2f,%.2f,%.2f",p,pn,nn);
	}
}