import java.util.Scanner;
public class Student extends Person
{
   private  String clas;
   private int roll;
    //default constructor
    public Student()
    {
        clas="no-class";
        roll=0;
    }
    //parametrized constructor
    public Student(String nm,String fnm,char gen,String cl,int rl)
    {
        super(nm,fnm,gen);
        clas=cl;
        roll=rl;
    }
    //input function
    public void input()
    {
        Scanner kb=new Scanner(System.in);
        super.input();
        System.out.print("Enter Class: ");
        clas=kb.nextLine();
        System.out.print("Enter Roll: ");
        roll=kb.nextInt();
        kb.nextLine();
    } 
    //show function
    public void show()
    {
        super.show();
        System.out.printf(" %-10s %5d",clas,roll);
    } 
}