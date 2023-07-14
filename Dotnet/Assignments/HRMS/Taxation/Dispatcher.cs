namespace Taxation
{
    public class Dispatcher
    {
        public delegate double TaxOperation(double salary, double taxPercent);
    }
}