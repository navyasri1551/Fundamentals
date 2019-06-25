
public class D10 {
	public static void main(String[] args)
	{
		char ch='a';
		if(ch>='a'&&ch<='z')
			System.out.print(ch+ "->" + Character.toUpperCase(ch)) ;
		else if(ch>='A'&&ch<='Z')
			System.out.print(ch+ "->" + Character.toLowerCase(ch)) ;
	}

}
