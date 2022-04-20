import java.util.*;
class RadixSort
{
	public int maxValue(int[] arr,int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}	
		return max;
	}
	public void radixSort(int[] arr,int n)
	{
		int m=maxValue(arr,n);
		for(int p=1;(m/p)%10>0;p=p*10)
		{
			count(arr,n,p);
		}
	}
	public void count(int arr[],int n,int p)
	{
		int c[]=new int[10];
		int op[]=new int[n];
		for(int i=0;i<n;i++)
		{
			++c[(arr[i]/p)%10];
		}
		for(int j=1;j<10;j++)
		{
			c[j]=c[j]+c[j-1];
		}
		for(int k=n-1;k>=0;k--)
		{
			op[c[(arr[k]/p)%10]-1]=arr[k];
			--c[(arr[k]/p)%10];
		}
		for(int e=0;e<n;e++)
		{
			arr[e]=op[e];
		}
	}
	public void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
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
		RadixSort r=new RadixSort();
		r.radixSort(arr,n);
		r.display(arr,n);
	}
}
