import java.util.Scanner;
class SmallestOfThreeNumber
{
    public static void main(String ... args)
    {
        Scanner p=new Scanner(System.in);
        int a,b,c;
        System.out.printf("Enter 1st number");
        a=p.nextInt();
        System.out.printf("Enter 2nd number");
        b=p.nextInt();
        System.out.printf("Enter 3rd number");
        c=p.nextInt();
        
        if(a<b)
        {
            if(a<c)
            System.out.printf("%d is smallest: ",a);
            else
            System.out.printf("%d is the smallest: ",c);
        }
        else
        {
            if(b<c)
            System.out.printf("%d is the smallest: ",b);
            else
            System.out.printf("%d is the smallest: ",c);
        }
        System.out.println("Thankyou");
    }
}