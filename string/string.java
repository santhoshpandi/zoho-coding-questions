import java.util.*;
class string{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		String str = c.next();
		int j=0;int cc=0;
		char[] arr = new char[str.length()/2];
		int[] arr1 = new int[str.length()/2];
		for(int i=0;i<str.length()/2;i+=1)
		{
			arr[i]=str.charAt(cc);
			arr1[j]=Integer.parseInt(str.substring(cc+1,cc+2));
			for(int k=0;k<arr1[j];k++)
			{
				System.out.print(arr[i]);
			}
			cc+=2;
			j+=1;
		}


	}
}