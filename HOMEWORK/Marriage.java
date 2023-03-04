import java.util.Scanner;
public class Marriage {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int age,gender;
        System.out.print("Enter Gender Of Person(1-male,2-female):");
        gender=s.nextInt();
        System.out.print("Enter age of person:");
        age=s.nextInt();
        if(gender==1)
        {
            //male
            if(age>=21)
            System.out.println("Person is eligiable for marry!");
            else
            {
                System.out.println("Personn is not eligible for Marry");
            }
        }
        else
        {
            //female
            if(age>=18)
            System.out.println(" Person is eligible for marry");
            else
            System.out.println("Personn is not eligible for Marry");
        }
        System.out.println("Thank You");
    }
}
