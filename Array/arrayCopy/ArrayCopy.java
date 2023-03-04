import java.util.Arrays;

public class ArrayCopy {
    public static void main(String...args)
    {
        int[] a={1,2,3,4,5,6,7,8,9};
        //create copy of a
        int b[]=a; //here not a copy is created but b is also refering the same object a is refering
        //method 1:by copying element by element
        int c[]=new int[a.length];
        //copy element by element
        for(int i=0;i<a.length;i++)
        c[i]=a[i];

        System.out.print("Content of array a=");
        for(int d:a)
        System.out.print(d+", ");

        System.out.print("Content of array c=");
        for(int d:c)
        System.out.print(d+", ");

        c[0]=10;
        c[1]=20;
        
        System.out.print("\n\n\nAfter chane in copied Array\nContent of array a=");
        for(int d:a)
        System.out.print(d+", ");

        System.out.print("Content of array c=");
        for(int d:c)
        System.out.print(d+", ");

        ////////////////////////////////////////
        //Method 2: clone()                 ///
        ///////////////////////////////////////
        int[] d=a.clone();
        System.out.print("\n\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array d=");
        for(int da:d)
        System.out.print(da+", ");
        
        d[0]=10;
        d[1]=20;
        
        System.out.print("\n\n\nAfter chane in copied Array\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array d=");
        for(int da:d)
        System.out.print(da+", ");

        ////////////////////////////////////////////
        ////Method 3: System.arraycopy()       ////
        /////////////////////////////////////////
        int []e=new int[a.length];
        System.arraycopy(a,0,e,0,a.length);
        System.out.print("\n\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array e=");
        for(int da:e)
        System.out.print(da+", ");

        e[0]=10;
        e[1]=20;
        
        System.out.print("\n\n\nAfter chane in copied Array\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array e=");
        for(int da:e)
        System.out.print(da+", ");

        /////////////////////////////////////////////////////
        //////Method 4: Arrays.copyOf()              /////////
        ////////////////////////////////////////////////////
        int f[]=Arrays.copyOf(a, 5);
        System.out.print("\n\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array f=");
        for(int da:f)
        System.out.print(da+", ");

        f[0]=10;
        f[1]=20;
        
        System.out.print("\n\n\nAfter chane in copied Array\nContent of array a=");
        for(int da:a)
        System.out.print(da+", ");

        System.out.print("Content of array f=");
        for(int da:f)
        System.out.print(da+", ");




    }
}
