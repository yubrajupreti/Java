import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the percentage obtained by student");
        float per= in.nextFloat();
        if(per>90)
        {
            System.out.println("Its A+ grade ");
        }
        else if (per>80)
        {
            System.out.println("Its A grade ");
            
        }
        else if (per>70)
        {
            System.out.println("Its B+ grade ");
        }
        else if (per>60)
        {
            System.out.println("Its B grade ");
        }
        else if (per>50)
        {
            System.out.println("Its C+ grade ");
        }
        else if (per>40)
        {
            System.out.println("Its C grade ");
        }
        else if (per>30)
        {
            System.out.println("Its D+ grade ");
        }
        else 
        {
            System.out.println("Its D grade ");
        }
        
       
        
    }
}
