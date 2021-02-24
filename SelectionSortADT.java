import java.util.Scanner;
public class SelectionSortADT
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
		selectionSort(a,n);
		System.out.println("Elements after sorting");
		display(a,n);
	}
	public static void selectionSort(int a[],int n)
	{
		int i,j,temp,min;
		for(i=0;i<n;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			if(min!=1)
			{
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}

			