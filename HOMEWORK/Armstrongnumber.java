import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String ... args)
    {
        int n,x,totalDigit,sumOfDigitPower,unitDigit;
        Scanner p=new Scanner(System.in);
        System.out.printf("Enter Any Number: ");
        n=p.nextInt();
        n=abs(n);
        //Find total number of digits in entered number
        totalDigit=0;
        x=n;
        while(x!=0)
        {
            x/=10;
            totalDigit++;
        }
        //find sum of each digit power of totalDigit
        x=n;
        while(x!=0)
        {
            //extract unit place digit of x
            unitDigit=x%10;

            //find the power totalnumber of unitdigits
            sumOfDigitPower+=pow(unitDigit,totalDigit);
            //remove unit place digit from x
            x/=10;
        }
        if(n==sumOfDigitPower)
        {
            System.out.printf("%d is armstrong number",n);
        }
        else
        {
            System.out.printf("%d is not Armstrong Number",n);
        }
        System.out.printf("Thank you");
    }
}
