import java.util.Scanner;
public class Main
{
    private static int getChoice()
    {
        
        Scanner kb=new Scanner(System.in);
        String menu[]={"\n1. Add new teacher","\n2. Add new student","\n3. View teachers",
                        "\n4. View students","\n5. Exit\n"};

        System.out.printf("\n\t\tMENU\n______________________________\n");
        for(String s:menu)
        System.out.print(s);
        do
        {
            try{
                System.out.print("\nEnter choice: ");
                return kb.nextInt();
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Invalid choice");
            }

        }while(true);                        
    }

    public static void main(String[] args)
    {
        Person[] sList=new Person[10];
        int sSize=0;
        //Person[] tList=new Person[10];
        int tSize=0;
        
        do
        {
            switch(getChoice())
            {
                case 1://code for add teachers.
                    ///check list full or not.
                    if(sSize==sList.length)
                    {
                        System.out.printf("\nList is already full!");
                        break;
                    }
                    //intialize by default constructor.
                    sList[sSize]=new Teacher();
                    //take input.
                    sList[sSize].input();
                    //increase size
                    sSize++;
                    System.out.printf("\n New teacher added successfully.");

                    break;
                case 2://code for add students;
                    //check list full or not.
                    if(sSize==sList.length)
                    {
                        System.out.printf("\nList is already full!");
                        break;
                    }
                    //intialize by default constructor.
                    sList[sSize]=new Student();
                    //take input.
                    sList[sSize].input();
                    //increase size
                    sSize++;
                    System.out.printf("\n New student added successfully.");

                    break;
                case 3://code for view teachers;
                    /*if(Size==0)
                    {
                        System.out.printf("\nList is empty!");
                        break;
                    }

                    System.out.printf("\n%-5s %-15s %-15s %-7s %-10s %8s\n","Id","Name","Father's name","Gender","Subject","Salary");
                    for(int i=0;i<80;i++)System.out.printf("_");
                    for(int i=0;i<tSize;i++)
                    {
                        System.out.printf("\n%3d. ",i+1);
                        tList[i].show();
                    }
                    System.out.printf("\n");
                    for(int i=0;i<80;i++)System.out.printf("_");
                    System.out.printf("\n\n");*/
                    break;
                case 4://code for view students;
                    if(sSize==0)
                    {
                        System.out.printf("\nList is empty!");
                        break;
                    }

                    System.out.printf("\n%-5s %-15s %-15s %-7s %-10s %8s\n","Id","Name","Father's name","Gender","Class","Roll");
                    for(int i=0;i<80;i++)System.out.printf("_");
                    for(int i=0;i<sSize;i++)
                    {
                        System.out.printf("\n%-3d. ",i+1);
                        sList[i].show();
                    }
                    System.out.printf("\n");
                    for(int i=0;i<80;i++)System.out.printf("_");
                    System.out.printf("\n\n");
                    break;
                case 5://code for exit
                    System.exit(0);
                default:
                    System.out.printf("\nYou have entered an invalid choice.");    

            }
        }while(true);
    }
}