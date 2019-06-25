
public class D17 
{
	public static void main(String args[])
	{
	int n=Integer.parseInt(args[0]);
	int i;
	if(args.length==0)
	{
		System.out.print("please enter a valid integer");
	}
	if(n==0||n==1)
		System.out.println(n+ "is not a prime number nor composite number");
	else
	{
	for(i=2;i<=n/2;i++)
	{
		int flag = 0;

		if(n%i==0)
		{
			flag=flag+1;
			System.out.println(n + " is not a prime");
			break;
		}
		if(flag==0)
		{
			System.out.println(n + " is a prime number");
			break;
		}
	
	}

}
	}
}
	