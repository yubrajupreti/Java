import java.util.Scanner;
public class ArrayAdd
{
    public static void main(String args[])
    {
        
        int i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of digit u want to add");
        int digit=input.nextInt();
        int [] add =new int [digit];
        System.out.println("enter the number to be added");
        for (i=0;i<digit;i++)
        {
            add[i]=input.nextInt();
            sum=sum+add[i];
        }
        System.out.println("the sum of the number is "+ sum );
    }
}