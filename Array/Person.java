
public class Person

{
    private String name;
    private String clas;
    private int roll;
    //default constructor
    public Person()
    {
        name="no-name";
        clas="clas" ;
        roll=0;
    
    }
    public Person(String name, String clas, int rol)
    {
        this.name=name;
        this.clas=clas;
        this.roll=roll;
    }

    public Person(String name){
        
        this(name,"clas",0);//it must be 1st statement of constructor
    }

    public void show(){
        System.out.print("name="+name+", clas="+clas+", roll="+roll );
    }

}