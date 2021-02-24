public class FibonacciSearch
{
	public static int fibSrch(int a[],int n,long key)
	{
		int initpos=0,pos,k;
		int fib[]={0,1,1,2,3,5,8,13,21,34,55,89,144};
		if(n==-1)
			return -1;
		k=0;
		while(fib[k]<n)
			k++;
		while(k>0){
			pos=initpos+fib[--k];
			if((pos>=n)||(key<a[pos]))
				continue;
			else
			{
				if(key>a[pos])
				{
					initpos=pos+1;
					k--;
				}
				else
					return pos;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int a[]={1,3,15,36,45,67,78,91};
		int key;
		key=Integer.parseInt(args[0]);
		int pos=fibSrch(a,8,key);
		String msg=(pos!=-1)?"Key found at"+pos:"Key not found";
		System.out.println(msg);
	}
}
