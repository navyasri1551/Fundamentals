
public class D16 {
	public static void main(String[] args)
	{
		int n;
		
		String prime=" ";
		for(n=10;n<=99;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
		{
			
			if(n%i==0){
				count=count+1;
			}
		}
		
			if(count==2)
			{
				prime=prime+n+" ";
			}
		}
		System.out.print(prime);
	}

}
