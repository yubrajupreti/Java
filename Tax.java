import java.util.Scanner;
public class Tax
{
    public static void main(String args[])
    {
        System.out.println("Enter the status\n .press 1.if unmarried \n press 2.if married");
        Scanner input =new Scanner(System.in);
        int status = input.nextInt();
        double tax;
        if(status==1)
        {
            System.out.println("Enter the salary of the months");
            double salary=input.nextDouble();
            double yearly_salary=12*salary;
            System.out.println("The total salary of the year is"+yearly_salary);
            
            if (yearly_salary<=350000)
            {
                tax=yearly_salary*0.01;
            }
            else if(yearly_salary<=450000)
            {
                tax=3500+(yearly_salary-350000)*0.1;
            }
            else if(yearly_salary<=650000)
            {
                tax=3500+10000+(yearly_salary-450000)*0.2;
            }
            else if(yearly_salary<=2000000)
            {
                tax=3500+10000+40000+(yearly_salary-650000)*0.3;
            }
            else
            {
                tax=3500+10000+40000+405000+(yearly_salary-2000000);
            }
            System.out.println("The tax to be paid is "+tax);
            
        }
        else if (status==2)
        {
            System.out.println("Enter the salary of the months");
            double salary=input.nextDouble();
            double yearly_salary=12*salary;
            System.out.println("The total salary of the year is"+yearly_salary);
            
            if (yearly_salary<=400000)
            {
                tax=yearly_salary*0.01;
            }
            else if(yearly_salary<=500000)
            {
                tax=4000+(yearly_salary-400000)*0.1;
            }
            else if(yearly_salary<=700000)
            {
                tax=4000+10000+(yearly_salary-450000)*0.2;
            }
            else if(yearly_salary<=2000000)
            {
                tax=4000+10000+40000+(yearly_salary-650000)*0.3;
            }
            else
            {
                tax=4000+10000+40000+390000+(yearly_salary-2000000);
            }
            System.out.println("The tax to be paid is "+tax);
            
        }
        else
        {
            System.out.println("sorry!! Invalid input");
        }
        
        
    }
    
}