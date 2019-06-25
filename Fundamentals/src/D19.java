
public class D19 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		
		if(args.length==0)
		{
			System.out.println("please enter an integer number");
		}
		while(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" * ");
					
				}
				System.out.println(" ");
				
			}
			break;
		}
	}

}
