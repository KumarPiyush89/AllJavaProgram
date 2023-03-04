import java.util.Scanner;
public class Power {
    public static void main(String ... args)
    {
        int b,p,r;
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter base value");
        b=s.nextInt();
        System.out.printf("Enter power value");
        p=s.nextInt();
        r=pow(b,p);
        //display power
        System.out.printf("Base:"+b);
        System.out.printf("Power:"+p);

        

    }
}
