import java.util.Scanner;
public class Quardatic
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a");
        double a =input.nextDouble();
        System.out.println("enter the value of b");
        double b =input.nextDouble();
        System.out.println("enter the value of c");
        double c =input.nextDouble();
        double condition =b*b-4*a*c;
        double x;
        double x1;
        if(condition<0)
        {
            System.out.println("the equation doesnot exit");
        
        }
        else
        {
             x=(-b+(Math.sqrt(b*b-4*a*c)))/2*a;
             x1=(-b-(Math.sqrt(b*b-4*a*c)))/2*a;
             System.out.println ("the value of x is either"+ x +" orn "+ x1);
        }
       
    }
}