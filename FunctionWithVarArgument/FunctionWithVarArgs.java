public class FunctionWithVarArgs
{
    public static float average(float[] nums)
    {
        float avg;
        if(nums.length==0)
        return 0.0f;

        float sum=0;
        for(float i:nums)
        sum+=i;

        return sum/nums.length;
    }
    public static void friends(String... strs)
    {
        System.out.printf("\n You have send me %d friends name: ",strs.length);
        for(String s:strs)
        System.out.printf("%s, ",s);
    } 
    public static void main(String[] args)
    {
        /*
        if function signature is (dataType... varName)
        syntax:
        System.out.printf("\nAverage = %f",average(1,2,3,4,5));
        */
        System.out.printf("Average = %f",average(new float[] {}));
        //System.out.printf("\nAverage = %f",average({1.0f}));   error
        System.out.printf("\nAverage = %f",average(new float[] {1}));
        System.out.printf("\nAverage = %f",average(new float[] {1,2}));
        System.out.printf("\nAverage = %f",average(new float[] {1,2,3}));
        System.out.printf("\nAverage = %f",average(new float[] {1,2,3,4,5}));


       friends();
       friends("Rakesh");
       friends("Rakesh","Ankit","Abhishek"); 
       friends("Rakesh","Ankit","Abhishek","Sudhanshu","Piyush");
    }
}