import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        int n,r;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number");
        n=s.nextInt();
        r=n%2;
        if(r==0)
        {
            System.out.println("Hello Piyush");
            System.out.println("What are you doing?");
        }
        else
        {
            System.out.println("hello Kumar Piyush");
            System.out.println("How are  you");
        }
    }

}
