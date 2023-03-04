import java.util.Scanner;
public class Teacher extends Person
{
   private String subject;
   private float salary;
    //default constructor
    public Teacher()
    {
        subject="no-subject";
        salary=0;
    }
    //parametrized constructor
    public Teacher(String nm,String fnm,char gen,String sub,float salary)
    {
        super(nm,fnm,gen);
        subject=sub;
        this.salary=salary;
    }
    //input function
    public void input()
    {
        Scanner kb=new Scanner(System.in);
        super.input();
        System.out.print("Enter Subject: ");
        subject=kb.nextLine();
        System.out.print("Enter Salary: ");
        salary=kb.nextFloat();
        kb.nextLine();
    } 
    //show function
    public void show()
    {
        super.show();
        System.out.printf(" %-10s %-6.2f",subject,salary);
    } 
}