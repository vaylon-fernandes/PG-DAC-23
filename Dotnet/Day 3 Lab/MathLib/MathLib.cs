namespace MathLib;

// Code to demo pass by reference 
public class MathCal
{
    // swapping using pass by reference 
    // ref keyword passes argument by value
    public static void Swap(ref object o1, ref object o2)
    {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }


    public static void CalculateArea(int radius, out double area, out double circumference)
    {
        const double PI = 3.14;
        area = PI * radius * radius;
        circumference = 2*PI * radius;

    }
}
