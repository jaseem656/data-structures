import java.util.Scanner;
public class MergeSortADT
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
		mergepass(a,0,n-1);
		System.out.println("Elements after sorting");
		display(a,n);
	}
	public static void mergepass(int a[],int lb,int ub)
	{
		int mid;
		if(lb!=ub)
		{
			mid=(lb+ub)/2;
			mergepass(a,lb,mid);
			mergepass(a,mid+1,ub);
			mergeSort(a,lb,mid,ub);
		}
	}
	public static void mergeSort(int a[],int lb,int mid,int ub)
	{
		int i,j,k;
		int temp[];
		temp=new int[20];
		i=lb;
		j=mid+1;
		k=lb;
		while((i<=mid) && (j<=ub))
		{
			if(a[i]<=a[j])
			{
				temp[k]=a[i];
				k++;
				i++;
			}
			else
			{
				temp[k]=a[j];
				k++;
				j++;
			}
		}
		while(i<=mid)
		{
			temp[k]=a[i];
			k++;
			i++;
		}
		while(j<=ub)
		{
			temp[k]=a[j];
			k++;
			j++;
		}
		for(int in=lb;in<=ub;in++)
			a[in]=temp[in];
	}
	public static void display(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
