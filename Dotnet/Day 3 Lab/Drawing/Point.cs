namespace Drawing
{

    // Code to demonstrate Structure 
    // Structure to plot a point x and y 
    public struct Point
    {
        public int x;
        public int y;

        // Default Constructor
        public Point()
        {
            this.x = 0;
            this.y = 0;
        }
        // Parameterised constructor
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}