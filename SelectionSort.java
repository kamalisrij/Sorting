import java.util.*;
class SelectionSort
{
	public void selection(int n,int[]arr)
	{
		int lastInd=n-1;
		while(lastInd>0)
		{
			int maxInd=0;
			for(int j=1;j<=lastInd;j++)
			{
				if(arr[maxInd]<arr[j])
					maxInd=j;
			}
			int maxVal=arr[maxInd];
			int lastVal=arr[lastInd];
			if(maxVal!=lastVal)
			{
				arr[lastInd]=maxVal;
				arr[maxInd]=lastVal;
			}
			lastInd--;
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
		SelectionSort s=new SelectionSort();
		s.selection(n,arr);
	}
}
