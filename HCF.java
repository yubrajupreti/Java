import java.util.Scanner;
public class HCF
{
    public static void main(String args[])
    {
        int hcf=1,i;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the two number");
        int num =in.nextInt();
        int num1=in.nextInt();
        for(i=1;i<=num && i<=num1;i++)
        {
            if(num%i==0 && num1%i==0)
            {
                hcf = i;
            }
        }
        System.out.println("The hcf is "+ hcf );
        
        
    }
    
}
