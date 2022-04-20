import java.util.*;
class MergeSort
{
	void merge(int[] arr,int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int e1=0;e1<n1;e1++)
			left[e1]=arr[l+e1];
		for(int e2=0;e2<n2;e2++)
			right[e2]=arr[mid+e2+1];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]>=right[j]){
				arr[k]=right[j];
				k++;
				j++;}
			else{
				arr[k]=left[i];
				k++;
				i++;}
		}
		while(i<n1){
			arr[k]=left[i];
			i++;
			k++;}
		while(j<n2){
			arr[k]=right[j];
			j++;
			k++;}
	}	
	void divide(int [] arr,int l,int r)
	{
		if(l<r)
		{
			int mid=(l-1+r)/2;
		
		divide(arr,l,mid);
		divide(arr,mid+1,r);
		merge(arr,l,mid,r);
		}
	}
	void display(int[] arr)
	{
		for(int ele=0;ele<arr.length;ele++)
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
		MergeSort m=new MergeSort();
		m.divide(arr,0,n-1);
		m.display(arr);
	}
		
}	
