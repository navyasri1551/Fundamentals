
public class D9 {
	public static void main(String[] args)
	{
		String gender=args[0];
		int a=Integer.parseInt(args[1]);
		if((gender.equals("Female"))&&(1<=a && a<=58))
			System.out.println("the percentage of interest is 8.2%");
		if((gender.equals("Female"))&&(59<=a && a<=100))
			System.out.println("the percentage of interest is 9.2%");
		if((gender.equals("male"))&&(1<=a && a<=58))
			System.out.println("the percentage of interest is 8.4%");
		if((gender.equals("male"))&&(59<=a && a<=100))
			System.out.println("the percentage of interest is 10.5%");
		
	}
	
}
