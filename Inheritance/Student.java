public class Student extends Person{
    private String clas;
    private int roll;
    public Student()
    {
        //it will call default constructor of super class
        clas="no-class";
        roll=0;
        System.out.print("\nStudent Created using default constructor");
    }

    public Student(String clas,int roll)
    {
        //it will also call default constructor of it's super class
        this.clas=clas;
        this.roll=roll;
        System.out.print("\n Student created using constructor having two argument");
    }

    //calling specific super class constructor in sub class constructor
    public Student(String name,String gender,String clas,int roll)
    {
        super(name,gender);//it will call the constructor having two argument of super class
        //Note: super() should be 1st statement of constructor
        this.clas=clas;
        this.roll=roll;
        System.out.print("\nStudent created using constructor having four argument");
    }

    public void showStudent()
    {
        showPerson();
        System.out.print(", class:"+clas+", roll:"+roll);
    }

    
}
