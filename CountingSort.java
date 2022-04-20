import java.util.*;
class CountingSort
{
	public void counting(int n,int[] arr)
	{
		int[] op=new int[n];
		int[] count=new int[100];
		for(int i=0;i<n;i++)
		{
			++count[arr[i]];
		}
		for(int i=1;i<100;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			op[count[arr[i]]-1]= arr[i];
			--count[arr[i]];
		}
		for(int j=0;j<n;j++)
		{
			arr[j]=op[j];
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
		
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		CountingSort c=new CountingSort();
		c.counting(n,arr);
	}
}
