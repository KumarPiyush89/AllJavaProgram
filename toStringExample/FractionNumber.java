public class FractionNumber {
    private int num;
    private int dnum;
    public FractionNumber()
    {
        num=0;
        dnum=1;
    }
    public FractionNumber(int num,int dnum)
    {
        this.num=num;
        this.dnum=dnum!=0?dnum:1;
    }
    //overrid toString() to return num/dnum
    public String toString()
    {
        return num+"/"+dnum;
    }
}
