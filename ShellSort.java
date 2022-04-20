import java.util.*;
class ShellSort
{
	public void shell(int n,int[] arr)
	{
		for(int gap=n/2;gap>0;gap=gap/2)
		{
			for(int j=gap;j<n;j++)
			{
				int temp=arr[j];
				int k;
				for(k=j;arr[k-gap]>temp;k=k-gap)
				{
					arr[k]=arr[k-gap];
				}
				arr[k]=temp;
			}
		}
		for(int ele=0;ele<n;ele++)
		{
			System.out.print(arr[ele]+" ");
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
		ShellSort s=new ShellSort();
		s.shell(n,arr);
	}
}
