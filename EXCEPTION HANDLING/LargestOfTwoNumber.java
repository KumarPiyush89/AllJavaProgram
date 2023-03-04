import java.util.InputMismatchException;
import java.util.Scanner;
public class LargestOfTwoNumber
{
    public static void main(String ... args)
    {
        int a=0,b=0;
        Scanner s=new Scanner(System.in);
       boolean valid;
        do{
            try{
                System.out.printf("Enter 1st any number:");
                a=s.nextInt();
                valid=true;
        }catch(InputMismatchException ex)
        {
            System.out.print("Please enter valid integer number.");
            valid=false;
            s.next();
        }}while(!valid);


       do
       {
            try{
            System.out.printf("Enter 2nd any number:");
            b=s.nextInt();
            valid=true;
            }
            catch(InputMismatchException ex)
            {
                System.out.print("Please enter a valid integer number");
                valid=false;
                s.next();

            }
        }while(!valid);

        if(a>b)
        System.out.println(a+" is Larger");
        else
        System.out.println(b+" is Larger");
    }
}
