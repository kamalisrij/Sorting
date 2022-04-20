import java.util.*;
class BubbleSort
{
	public void bubble(int n,int[] arr)
	{
		int last=n;
		for(int e=0;e<last;e++)
		{
			for(int j=e+1;j<last;j++)
			{
				int curr=arr[e];
				int next=arr[j];
				if(curr>next)
				{
					arr[e]=next;
					arr[j]=curr;
				}
			}
		}
		System.out.println(" ");
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
		BubbleSort b=new BubbleSort();
		b.bubble(n,arr);
	}
}
