import java.util.Scanner;
public class InsertionSortADT
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
		insertionSort(a,n);
		System.out.println("Elements after sorting");
		display(a,n);
	}
	public static void insertionSort(int a[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			temp=a[i];
			j=i-1;
			while((j>0) && (temp<a[j]))
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
		System.out.println();
	}
}
