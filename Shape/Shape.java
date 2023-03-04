public abstract class Shape
{
    protected int numberOfSides;
    public Shape()
    {
        numberOfSides=0;
    }
    public Shape(int numberOfSides)
    {
        this.numberOfSides=numberOfSides;
    }
    abstract public float getArea();
    abstract public float getPerimeter();
    abstract public void show();

}