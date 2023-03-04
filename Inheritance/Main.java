
public class Main {
 
    public static void main(String args[])
    {
        Student s1=new Student();
        System.out.println("\n");
        Student s2=new Student("BCA",70);
        System.out.println("\n");
        Student s3=new Student("Kumar Piyush","m","BCA",10);
        System.out.println("\n");
        s1.showStudent();
        s2.showStudent();
        s3.showStudent();
    }
}
