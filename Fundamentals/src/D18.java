
public class D18 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int sum=0,a;
		
		for(;n>0;)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
			
			}
		System.out.print(sum);
	}

}
