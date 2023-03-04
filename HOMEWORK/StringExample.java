/* In Java There are three classes to represent string value:
 * 1. String
 * 2. StringBuffer
 * 3. StringBuilder
 * 
 * 1. String - Any string literal in Java code is the object of String
 * 
 * String object's are immutable.
 * 
 */
import java.util.Scanner;
public class StringExample {
public static void main(String ... args)
{
    String name,clas;
    int roll,p1,p2,p3;
    int total;
    float percentage;
    Scanner s=new Scanner(System.in);
    System.out.printf("enter name:");
    name=s.nextLine();
    System.out.print("Enter class:");
    clas=s.nextLine();
    System.out.print("Enter roll:");
    roll=s.nextInt();
    System.out.print("Marks Of Paper 1:");
    p1=s.nextInt();
    System.out.print("Marks Of Paper 2:");
    p2=s.nextInt();
    System.out.print("Marks Of Paper 3:");
    p3=s.nextInt();
    total=p1+p2+p3;
    percentage=total/3.0f;
    System.out.println("Name:"+name);
    System.out.println("Class:"+clas);
    System.out.println("Roll:"+roll);
    System.out.println("Paper1:"+p1+"\nPaper2:"+p2+"\nPaper3:"+p3+"\nTotal:"+total+"\nPercentage:"+percentage+"%");


} 
}