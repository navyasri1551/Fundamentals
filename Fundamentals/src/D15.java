
public class D15 
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag++;
			System.out.println("not a prime");
			break;
			}
			if(flag==0){
				System.out.println(" prime");
				break;
			}
				
			
		}
	}
}
