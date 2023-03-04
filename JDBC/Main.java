/*public class public static void main(String[] args) {
    
}*/
public class Main
{
    public static void main(String{} args)
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("ClassLoaded");
    }
    catch(Exception ex)
    {
        System.out.println("error: "+ex);
    }
}

}