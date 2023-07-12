using MathLib;


int c1 = 0;
int c2 = 5;
object o1 = (object)c1;
object o2 = (object)c2;

MathCal.Swap(ref o1, ref o2);

Console.WriteLine(o1 + " " + o2);

