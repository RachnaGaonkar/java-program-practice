import java.util.Scanner;

public class Call
{
    public static void main(String[] agr)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no:");
         i = Integer.parseInt(sc.next());

        System.out.print("enter a no:");
         j = Integer.parseInt(sc.next());

        Largeno la = new Largeno();
        la.callfunction(i,j);
    }
}
