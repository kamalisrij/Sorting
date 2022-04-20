import java.util.*;
class RecurInsert
{
	public void insert(int n,int[] arr)
	{
		if(n<2)
			return;
		insert(n-1,arr);
		int i;
		int last=arr[n-1];
		for(i=n-1;i>0 && arr[i-1]>last;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=last;
	}
	public void display(int n,int[] arr)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
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
		RecurInsert r=new RecurInsert();
		r.insert(n,arr);
		r.display(n,arr);
	}
}
