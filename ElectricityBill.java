import java.util.Scanner;
public class ElectricityBill
{
    private int customerID;
    private String name;
    private int units;
    private int amount;
    
    public void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID  of the customer");
        customerID=input.nextInt();
        System.out.println("Enter the name of the customer");
        name = input.nextLine();
        System.out.println("Enter the unit consumed by the customer");
        units= input.nextInt();
        
    }
    public void calc()
    {
        int amount=0;
        if (units<21)
        {
            amount =units*7;
        }
        else if(units<81)
        {
            amount=140+(10*(units-20));
        }
        else if(units<121)
        {
            amount=740+(15*(units-80));
        }
        else 
        {
        amount=1370+(20*(units-120));
        }
           
    }
    
    public void display()
    {
        System.out.println(customerID + "\t\t\t"+name+"\t\t\t"+units+"\t\t"+amount);
    }
    
    public static void main(String [] args)
    {
        ElectricityBill bill1=new ElectricityBill();
        ElectricityBill bill2=new ElectricityBill();
        
        bill1.input();
        bill2.input();
        
        bill1.calc();
        bill2.calc();
        
        System.out.println("CustomerId"+"\t\t\t"+"Name"+"\t\t\t"+"units"+"\t\t"+"Amount");
        bill1.display();
        bill2.display();
    }
    
}


















