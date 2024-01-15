import java.io.*;
class Large
{
	public static void main(String[] agrs)
	{
		try
		{
			BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("enter a no. : ");
			int a = Integer.parseInt(bu.readLine());

			System.out.print("enter a no. : ");
			int b = Integer.parseInt(bu.readLine());

			if(a>b)
			{
				System.out.println(a + " is greater than " + b);
			}
			else if(a<b)
			{
				System.out.println(b + " is greater than " + a);
			}
			else
			{
				System.out.println(a + " and " + b +" are equal ");
			}	
		}
		catch(IOException j)
		{	
			j.getMessage();
		}
	} 
}