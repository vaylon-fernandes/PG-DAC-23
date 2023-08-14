namespace BOL
{
    public class Product
    {
        public Product(int id, string name, string description, double price, int quantity, Category productCategory)
        {
            Id = id;
            Name = name;
            Description = description;
            Price = price;
            Quantity = quantity;
            ProductCategory = productCategory;
        }

        public Product()
        {
            Id = 0;
            Name = String.Empty;
            Description = String.Empty;
            Price = 0.0;
            Quantity = 0;
            ProductCategory = Category.MISCELLANEOUS;
        }
        /* public int Id { get; set };
private string name;
private string description;
private double price;
private int quantity;
private Category productCategory;*/
        public int Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public double Price { get; set; }
        public int Quantity { get; set; }
        public Category ProductCategory{ get; set; }

        public override string ToString()
        {
            return $"id:{Id},  Name:{Name}, description:{Description}, Price:{Price}, quantity: {Quantity}, Category:{ProductCategory}";
        }
    }
}