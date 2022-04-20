import java.util.*;
class Insertion
{
	public void insert(int n,int[] arr)
	{
		int first=1;
		while(first<n)
		{
			int ele=arr[first];
			int j;
			for(j=first;j>0 && arr[j-1]>ele;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=ele;
			first++;
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
		Insertion s=new Insertion();
		s.insert(n,arr);
	}
}
