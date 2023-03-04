import java.util.Scanner;
public class Person
{
   private String name;
   private String  fname;
   private char gender;
    //default constructor
    public Person()
    {
        name="no-name";
        fname="no-father's name";
        gender='u';
    }
    //parametrized constructor
    public Person(String nm,String fnm,char gen)
    {
        name=nm;
        fname=fnm;
        gender=gen;
    }
    //input function
    public void input()
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=kb.nextLine();
        System.out.print("Enter Father's name: ");
        fname=kb.nextLine();
        System.out.print("Enter gender (M/F/O): ");
        gender=kb.next().charAt(0);
        kb.nextLine();
    } 
    //show function
    public void show()
    {
        System.out.printf(" %-15s %-15s %-7s",name,fname,gender);
    } 
}