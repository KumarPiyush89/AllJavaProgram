import java.util.Scanner;
public class Subtract {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        a=s.nextInt();
        System.out.print("Enter 2nd number:");
        b=s.nextInt();
        c=a-b;
        //System.out.printf("%d-%d=%d",a,b,c);
        System.out.printf(a+"-"+b+"="+c);
    }
}
