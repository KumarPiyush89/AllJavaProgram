import java.util.InputMismatchException;
import java.util.Scanner;
 public class AreaoFCircle 
{
    public static void main(String ... args)
    {
        float r,c;
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter Radius:");
        try{
        r=s.nextFloat();
        c=(float) (3.14*r*r);
        System.out.println("Area Of Circle is:"+c);
        }catch(InputMismatchException ex)
        {
            System.out.println("OOPs You haven't entered a valid number");
        }
    }
}
