namespace BOL
{
    public class Product
    {
        private int id;
        private string name;
        private string description;
        private double price;
        private int quantity;
        private Category productCategory;

        public Product()
        {
            this.Id = 0;
            this.Name = string.Empty;
            this.Description = string.Empty;
            this.Price = 0;
            this.Quantity = 0;
            this.ProductCategory = Category.MISCELLANEOUS;
        }
        public Product(int id, string name, string description, double price, 
            int quantity, Category productCategory)
        {
            this.Id = id;
            this.Name = name;
            this.Description = description;
            this.Price = price;
            this.Quantity = quantity;
            this.ProductCategory = productCategory;
        }

        public int Id { get => id; set => id = value; }
        public string Name { get => name; set => name = value; }
        public string Description { get => description; set => description = value; }
        public double Price { get => price; set => price = value; }
        public int Quantity { get => quantity; set => quantity = value; }
        public Category ProductCategory { get => productCategory; set => productCategory = value; }

        public override string ToString()
        {
            return $"{Id} {Name} {Description} {Price} {Quantity} {ProductCategory}";
        }
    }
}