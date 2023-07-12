namespace Drawing
{
    public class Line : Shape
    {
        public Point startPoint;
        public Point endPoint;

        public Line() : base() // public Line(){ super();}
        {
            this.startPoint = new Point();
            this.endPoint = new Point();
        }
        public Line(Point startPoint, Point endPoint, int width, string color) : base(width, color)
        {
            // super(width, color)
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }

        public override void Draw()
        {
            string line = string.Format("(x1: {0} y1: {1}), (x2: {2} y2: {3}),  width:{4} color:{5}",
            this.startPoint.x, this.startPoint.y, this.endPoint.x, this.endPoint.y, width, color);
            Console.WriteLine(line);
        }
    }
}