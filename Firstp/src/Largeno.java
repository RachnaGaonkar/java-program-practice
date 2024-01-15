// largest no.
import java.util.Scanner;
public class Largeno
{
     void callfunction(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a + " is greater");
        }
        else if(a<b)
        {
            System.out.println(b + " is greater");
        }
        else
        {
            System.out.println(a + " and "+b+ " are equal");
        }
    }
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in); //requesting object from scanner class and we gave name to the object as sc
        System.out.print("enter a no:");
       // String st = sc.next();
       // int a = Integer.parseInt(st);
        // creating variable a,b,c.
        int i = Integer.parseInt(sc.next());

        System.out.print("enter a no:");
        int j = Integer.parseInt(sc.next());

        Largeno large = new Largeno();
        large.callfunction(i,j);

        //callfunction(i,j);

    }
}
