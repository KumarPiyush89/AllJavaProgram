public class Rectangle extends Shape {
    private float length;
    private float breadth;
    public Rectangle()
    {
        super(4);
        length=0;
        breadth=0;
    }
    public Rectangle(float length,float breadth)
    {
        super(4);
        this.length=length;
        this.breadth=breadth;
    }
    public void setSides(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    //overriding super class abstract methos
    public float getArea()
    {
        return length*breadth;
    }
    public float getPerimeter()
    {
        return 2*(length+breadth);
    }
    public void show()
    {
        System.out.println("\nI am Rectangle. My length is:"+length+" and Breadth is:"+breadth);
    }

    
}
