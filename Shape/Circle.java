public class Circle extends Shape{
    private float radius;
    public Circle()
    {
        super(-1);
        radius=0;
    }
    public Circle(float radius)
    {
        super(-1);
        this.radius=radius;
    }
    public void setRadius(float radius)
    {
        this.radius=radius;
    }
    public float getArea()
    {
        return (float)(Math.PI*radius*radius);
    }
    public float getPerimeter()
    {
        return (float)(2*Math.PI*radius);
    }
    public void show()
    {
        System.out.println("\n I am Circle. My radius is "+radius);
    }
    
}
