public class D6 
{
	public static void main(String args[])
	{
		if(args.length==0) {
			System.out.println("No Value");
		}
		int size=args.length;
		for(int i=0;i<size;i++)
		{
			if(i==size-1)
			{
				System.out.print(args[i]);
			}
			else
			{
				System.out.print(args[i]+",");
			}
				
	}
	
	}
}
