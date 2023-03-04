import java.util.Scanner;
class SmallestSquareLargestSquareroot
{
    public static void main(String[] args)
    {
    Scanner p=new Scanner(System.in);
    int a,b,c,s,l;
    float sq,sr;
    System.out.printf("Enter 1st number: ");
    a=p.nextInt();
    System.out.printf("Enter 2nd number: ");
    b=p.nextInt();
    System.out.printf("Enter 3rd number: ");
    c=p.nextInt();

    //FInd the smallest number
    if(a<b)
    {
        if(a<c)
            s=a;
        else
            s=c;
    }
    else
    {
        if(b<c)
        s=b;
        else
        s=c;
    }

    // Find the largest number

    if(a>b)
    {
        if(a>c)
        l=a;
        else
        l=c;
    }
    else
    {
        if(b>c)
        l=b;
        else
        l=c;
    }

    // find the square root of the largest number
    //sq=Math.sqrt(l);
    sq=(float)Math.sqrt(l);


    // find the square of smallest number
    sr=s*s;
    //sr=pow(s,2);
    System.out.printf("You have entered %d , %d and %d",a,b,c);
    System.out.printf("Smallest number is %d ",s);
    System.out.printf("And largest number is %d",l);
    System.out.printf("Squareroot is the %d is %d",l,sq);
    System.out.printf("And Square is the %d is %d",s,sr);

    System.out.printf("Thank you");
}
}