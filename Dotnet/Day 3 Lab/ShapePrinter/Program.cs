using Drawing;
using System.Collections.Generic;

Point p1 = new Point(12, 34);
Point p2 = new Point(22, 12);
Point p3 = new Point();
Point p4 = new Point(33, 88);

Shape l1 = new Line(p1, p2, 10, "red");
Shape l2 = new Line(p2, p3, 12, "blue");
Shape l3 = new Line();
Shape l4 = new Line(p3, p4, 122, "green");

List<Shape> box = new List<Shape>();
box.Add(l1);
box.Add(l2);
box.Add(l3);
box.Add(l4);

foreach (Shape shape in box)
{
    if (shape != null)
    {
        shape.Draw();
    }
}