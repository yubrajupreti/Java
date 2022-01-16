import java .util.Scanner;
public class Lottery
{
    public static void main(String args[])
    {
        System.out.println("Enter the two digit or one digit number");
        Scanner lot = new Scanner(System.in);
        int a =lot.nextInt();
        int r = (int)(Math.random()*100);
        System.out.println("The randomly generated number is "+ r);
        int a_f= a/10;
        int a_s= a%10;
        int r_f= r/10;
        int r_s = r%10;
        if (a==r)
        {
            System.out.println("congratulation!!!!! You have won rs 10000000");
        }
        else if((a_f==r_f||a_f==r_s)&&(a_s==r_f|| a_s==r_s))
        {
             System.out.println("congratulation!!!!! You have won rs 5000000");
        }
        else if((a_f==r_f||a_f==r_s)||(a_s==r_f|| a_s==r_s))
        {
            System.out.println("congratulation!!!!! You have won rs 2500000");
            
        }
        else
        {
            System.out.println("Better try next time");
        }
      
    }
   
}