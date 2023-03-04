import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int a,b,c;
        System.out.printf("Enter 1st Number: ");
        a=p.nextInt();
        System.out.printf("Enter 2nd Number: ");
        b=p.nextInt();
        System.out.printf("Enter 3rd Number: ");
        c=p.nextInt();

        if(a>b)
        {
            if(b>c)
            System.out.printf(" %d is the largest number",b);
            else
            System.out.printf("%d is the largest",c);
        }
        else
        {
            if(a>c)
            System.out.printf("%d is the largest",a);
            else
            System.out.printf("%d is the largest",c);
        }
        System.out.println("Thank you");
    }
}
