using MathLib;


int c1 = 0;
int c2 = 5;
object o1 = (object)c1;
object o2 = (object)c2;

String data = String.Format("Before Swap: O1: {0} O2: {1}", o1, o2);
Console.WriteLine(data);
MathCal.Swap(ref o1, ref o2);
data = String.Format("Before Swap: O1: {0} O2: {1}", o1, o2);
Console.WriteLine(data);

int radius = 4;
double area =0, circumference = 0;
MathCal.CalculateArea(radius, out area, out circumference);
data = String.Format("Radius: {0} Area: {1} Circumference: {2}", radius,area,circumference);
Console.WriteLine(data);