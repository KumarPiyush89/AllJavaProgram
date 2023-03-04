import java.util.Scanner;
public class MathExample {
public static void main(String ... args)
{
    //Input a number and print square and square root of entered number
    float n,sq,st;
    Scanner s=new Scanner(System.in);

    System.out.print("Enter any number:");
    n=s.nextFloat();
    sq=(float)Math.pow(n,2);
    st=(float)Math.sqrt(n);
    float st1=(float)Math.pow(n,.5);
    System.out.print("Entered number is "+n+" , Its square is:"+sq+", square root is:"+st+", again aquare root is:"+st1);

}    
}