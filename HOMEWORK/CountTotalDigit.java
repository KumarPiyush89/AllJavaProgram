import java.lang.*;
import java.util.Scanner;
class CountTotalDigit
{
    public static void main(String ... args)
    {
        Scanner s=new Scanner(System.in);
        int n,x,totaldigit=0;
        System.out.printf("Enter any integer number:");
        n=s.nextInt();
        //count total number of digit in n
        x=n;
        do{
            x/=10;
            totaldigit++;
        }while(x!=0);
        System.out.print("You have entered:"+n+", it has "+totaldigit+ " digit(s)");
    }
}