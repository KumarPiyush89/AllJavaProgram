public class Menu {
    private String name;
    private String clas;
    private int roll;
    private int Hindi;
    private int English;
    private int Math;
    private int Science;
    private int Sst;
    
    public Menu()
    {
        this.name="no-name";
        this.clas="no-clas";
        this.roll=0;
        this.Hindi=0;
        this.English=0;
        this.Math=0;
        this.Science=0;
        this.Sst=0;
    }
    public void set(String name, String clas)
    {
        this.name=name;
        this.clas=clas;
    }
    public void set(String name, String clas,int roll,int Hindi,int English,int Math,int Science,int Sst)
    {
        this.name=name;
        this.clas=clas;
        this.roll=roll;
        this.Hindi=Hindi;
        this.English=English;
        this.Math=Math;
        this.Science=Science;
        this.Sst=Sst;
    }
    public void show()
    {
        System.out.println("name="+name);
        System.out.println("clas="+clas);
        System.out.println("roll="+roll);
        System.out.println("Hindi="+Hindi);
        System.out.println("English="+English);
        System.out.println("Math="+Math);
        System.out.println("Science="+Science);
        System.out.println("Sst="+Sst);
    }
}
