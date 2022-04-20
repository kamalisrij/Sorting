import java.util.*;
class QuickSort
{
	public void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public int partition(int[] arr,int l,int h)
	{
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<=h;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;
	}
	public void quick(int[] arr,int l,int h)
	{
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quick(arr,l,pi-1);
			quick(arr,pi+1,h);
		}
	}
	public void display(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");
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
		QuickSort q=new QuickSort();
		q.quick(arr,0,n-1);
		q.display(arr,n);
	}
}
