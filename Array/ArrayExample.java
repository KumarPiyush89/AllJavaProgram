
public class ArrayExample {
public static void main(String ...args)    
{
    /* In Java Array is an Object */
    /*
     * creating Array in Java
     * -----------------------------
     * 1. Creating Array Reference
     * DataType arrayRefName[];
     * ex: 
     * int arr[]; //here arr is an array reference
     * 2. Creating Array
     * arrReferenceName=new dataType[SIZE];//Here SIZE can be an integer variable or literal
     * ex:
     * arr=new int[10];
     */
    int arr[]=new int[5];
    System.out.println("Array arr capacity is:"+arr.length);
    arr[0]=10;
    arr[1]=20;
    arr[2]=50;
    arr[3]=30;
    arr[4]=40;
    //arr[5]=20;
    System.out.println("Array values:");
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+",");

}
}
