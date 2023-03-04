public class ArrayEx2 {
    public static void main(String []args)   
    {
        int arr1[];
        int[] arr2;
        int a[],b,c;// a is a reference of int array ,b and c are normal int variable
        int[] d,e,f[];// d and e are reference of 1D integer array while f is a reference of 2D integer array
    
        //1D array creation
        arr1 =new int[10];
    
        //initializing 1D Array
        arr2=new int[]{1,2,3,4,5,6,7,8};
    
        //initializing 1D Array
        //a=new int[5]{1,2,3,4,5};
    
        System.out.print("Content of array arr1=");
        for(int i=0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ,");
    
        System.out.print("\nContent of array arr2=");
        for(int ad:arr2)
        System.out.print(ad+", ");
    
        String[] names=new String[]{"Rakesh Kumar","Ankit Kumar","Sudhanshu Kumar","Aaryan Raj","Kumar Piyush","Abhishek Kumar"};
        System.out.print("\nAll Names are:");
        for(String name:names)
        System.out.println(name);
        //Copying Array
        a=arr2;//Here not array is copied, while reference is copied
        //a and arr2 are refering to same array
        System.out.print("\nContent of arr2=");
        for(int ad:arr2)System .out.print(ad+", ");
    
        System.out.print("\nContent of a=");
        for(int ad:a)System .out.print(ad+", ");
    
        //chane the value os arr2
        arr2[0]=10;
        arr2[1]=20;
        System.out.print("\n================\nContent of arr2=");
        for(int ad:arr2)System .out.print(ad+", ");
    
        System.out.print("\nContent of a=");
        for(int ad:a)System .out.print(ad+", ");
    }
   }
   