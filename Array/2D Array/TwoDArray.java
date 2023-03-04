import java.util.Scanner;
public class TwoDArray {
    public static void main(String ... args)
    {
        int arr1[][]=new int[3][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=3;
        arr1[1][0]=11;
        arr1[1][1]=12;
        arr1[1][2]=13;
        arr1[2][0]=21;
        arr1[2][1]=22;
        arr1[2][2]=23;
        System.out.print("\nContent of arr1=\n");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.printf("%4d",arr1[i][j]);
            }
            System.out.println();
        }

        int arr2[][]={{1,11,111,1111},{2,22,222,2222},{3,33,333,3333},{4,44,444,4444}};
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.printf("%6d",arr2[i][j]);
            }
            System.out.println();
        }

        int arr3[][]={{1,2,3,4,5},{1},{1,2,3},{1,2,3,4},{1,2}};
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3[i].length;j++)
            {
                System.out.printf("%4d",arr3[i][j]);
            }
            System.out.println();
        }

        int arr4[][]=new int[4][];
        arr4[0]=new int[1];
        arr4[1]=new int[2];
        arr4[2]=new int[3];
        arr4[3]=new int[4];
        for(int i=0;i<arr4.length;i++)
        {
            for(int j=0;j<arr4[i].length;j++)
            {
                System.out.printf("%4d",arr4[i][j]);
            }
            System.out.println();
        }
        //traversal of 2d using foreach version
        System.out.println("\n\nContent of arr4=");
        for(int a[]:arr4)
        {
            for(int b:a)
            System.out.printf("%5d",b);
            System.out.println();
        }
        Scanner kb=new Scanner(System.in);
        int arr5[][];
        int r;
        System.out.print("Enter number of row:");
        r=kb.nextInt();
        arr5=new int[r][];
        int c;
        for(int j=0;j<r;j++)
        {
            System.out.print("Enter number of columns in row "+(j+1)+":");
            c=kb.nextInt();
            arr5[j]=new int[c];
        }
        System.out.println("\n");
        for(int i=0;i<arr5.length;i++)
        {
            for(int j=0;j<arr5[i].length;j++)
            {
                System.out.printf("Enter value for [%d][%d]:",i,j);
                arr5[i][j]=kb.nextInt();
            }
        }

        System.out.println("content of arr5=");
        for(int i[]:arr5)
        {
            for(int j:i)
            {
                System.out.printf("%5d",j);
            }
            System.out.println();
        }


    }
    
}
