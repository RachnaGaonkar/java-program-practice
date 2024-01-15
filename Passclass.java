import java.io.*;
class Passclass
{
	public static void main(String[] arg)
     	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//max marks in cpro
			System.out.print("max marks in cpro:");
			int A = Integer.parseInt(br.readLine());
			
			//obtain marks
			System.out.print("obtain marks:");
			int a = Integer.parseInt(br.readLine());
			
			//max marks in wd
 			System.out.print("max marks in wd:");
			int B = Integer.parseInt(br.readLine());
			
			//obtain marks in wd
			System.out.print("obtain marks:");
			int b = Integer.parseInt(br.readLine());
			
			//max marks in DE
			System.out.print("max marks in DE.:");
			int C = Integer.parseInt(br.readLine());
			
			//obtain marks in DE
			System.out.print("obtain marks:");
			int c = Integer.parseInt(br.readLine());
			
			//max marks in os
			System.out.print("max marks in os.:");
			int D = Integer.parseInt(br.readLine());
			
			//obtain marks in os
			System.out.print("obtain marks:");
			int d = Integer.parseInt(br.readLine());

			//max marks in co
			System.out.print("max marks in co.:");
			int E = Integer.parseInt(br.readLine());
			
			//obtain marks in co
			System.out.print("obtain marks:");
			int e = Integer.parseInt(br.readLine());


			//to find % 
			float total = A+B+C+D+E;
			float obtain = a+b+c+d+e;
			float per = (obtain/total)*100f;
			
			System.out.println("total marks are: " + total);
			System.out.println("total marks obtain : " + obtain);
			System.out.println("your percentage is  : " + per);
			
			if(per>=75 && per<100)
			{
				System.out.println(" you secured distintion.....");
			}
			else if(per>=60 && per<75)
			{
				System.out.println(" you secured firstClass.....");
			}
			else if(per>=33 && per<60)
			{
				System.out.print("you secured passClass......");
			} 
			else
			{
				System.out.println("you  fail.....");
			}


						
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
}
			




			