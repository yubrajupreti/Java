import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num= in.nextInt();
        int i,flag=0;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        {
            System.out.println(num + " is a prime number");
           
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
}