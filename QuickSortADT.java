import java.util.Scanner;
public class QuickSortADT
{
	public static void main(String[] args)
	{
		int a[];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array of elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Elements before sorting");
		display(a,n);
		quickSort(a,0,n-1);
		System.out.println("Elements after sorting");
		display(a,n);
	}
	public static void quickSort(int a[],int left,int right)
	{
		int l,u,temp,pivot;
		l=left;
		u=right;
		pivot=left;
		while(left!=right)
		{
			while((a[right]>=a[pivot]) && (left!=right))
				right--;
			if(left!=right)
			{
				temp=a[pivot];
				a[pivot]=a[right];
				a[right]=temp;
				pivot=right;
			}
			while((a[left]<=a[pivot]) && (left!=right))
				left++;
			if(left!=right)
			{
				temp=a[pivot];
				a[pivot]=a[left];
				a[left]=temp;
				pivot=left;
			}
		}
		if(l<pivot)
			quickSort(a,l,pivot-1);
		if(pivot<u)
			quickSort(a,pivot+1,u);
	}
	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
