import java.util.Scanner;
public class Multiply
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num= in.nextInt();
        if(num % 7==0 && num%5==0)
        {
            System.out.println("the number is divisible by 7 and 5");
        }
        else if(num % 7==0)
        {
             System.out.println("the number is divisible by 7 but not by 5");
        }
        else if( num%5==0)
        {
             System.out.println("the number is divisible by 5 but not by 7");
        }
        else
        {
            System.out.println("The number is not divisible by 5 and 7");
        }
    }
}
