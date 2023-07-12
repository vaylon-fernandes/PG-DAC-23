namespace Drawing;

// Abstract class to define shape
public abstract class Shape
{
    public int width;
    public string color;

    // Default Constructor 
    public Shape()
    {
        this.width = 1;
        this.color = "black";
    }
    //Parameterised constructor
    public Shape(int width, string color)
    {
        this.width = width;
        this.color = color;
    }

    // Abstract method Draw shape
    public abstract void Draw();

}