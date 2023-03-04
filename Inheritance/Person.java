public class Person{
    private String name;
    private String gender;
    public Person()
    {
        name="no-name";
        gender="u";
        System .out.print("\nPerson created using default constructor");
    }
    public Person(String name,String gender)
    {
        this.name=name;
        this.gender=gender;
        System.out.print("\nPerson created using parametrized constructor");
    }
    public void showPerson()
    {
        System.out.print("\nname:"+name+", gender:"+gender);
    }
    
}
