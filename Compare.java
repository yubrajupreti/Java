import java.util.Scanner;
public class Compare
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the total quantity of 1 type of rice with its total price");
        double quantity =input.nextDouble();
        double price =input.nextDouble();
        System.out.println("enter the total quantity of 2 type of rice with its total price");
        double quantity2 =input.nextDouble();
        double price2 =input.nextDouble();
        double per_kg=price/quantity;
        double per_kg2=price2/quantity2;
        if(per_kg<per_kg2)
        {
            System.out.println("the type 1 rice is better than type 2 rice .Hence,its per kg price is"+per_kg +"whereas type1 rice" +
            "per kg is " + per_kg2);
        }
        else if(per_kg2<per_kg)
        {
            System.out.println("the type 2 rice is better than type 1 rice..Hence,its per kg price is"+ per_kg2 +"whereas type1 rice"+
            "per kg is " + per_kg);
            
        }
        else
        {
            System.out.println("both are equivalent to each other");
        }
        
    }
}
