public class Interest
{
    float rate,time,principle;
    
    Interest(float a, float b,float c)
    {
        this.rate=a;
        this.time=b;
        this.principle=c;
    }
    public static void main(String args[])
    {
        
        float a =5,b=6,c = 8000;
        Interest simple =new Interest(a,b,c);
        float interest=(simple.rate*simple.time*simple.principle)/100;
        System.out.println(interest);
        
    }
}