import java.io.*;
class Switch
{
	public static void main(String[] agrs)
	{
		System.out.println("1.To add number");
		System.out.println("2.To subtract number");
		System.out.println("3.To multiple number");
		
		try
		{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter your choice : ");
			int choice = Integer.parseInt(read.readLine());

			System.out.print("Enter 1st no. : ");
			int a = Integer.parseInt(read.readLine());
			
			System.out.print("Enter 2nd no. : ");
			int b = Integer.parseInt(read.readLine());
			
			
			switch(choice)
			{	
				case 1:
					System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
					break;
				case 2:
					System.out.println("The difference of " + a + " and " + b + " is " + (a-b));
					break;
				case 3:
					System.out.println("The product of " + a + " and " + b + " is " + (a*b));
					break;
				default:
					System.out.println("Invalid choice");
					
			}
		}
		catch(Exception x)
		{
			x.getMessage();
		}	
	}

}