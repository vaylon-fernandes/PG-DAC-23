using BOL;
using Google.Protobuf;
using MySql.Data.MySqlClient;
using System.Diagnostics.Contracts;
using System.Globalization;

namespace DAL
{
    public class DBManager
    {
        public static string conString = @"server=localhost;port=3306;user=root;password=root123;database=dotnetworld";

        public static List<Product> GetProducts()
        {
            List<Product> products = new List<Product>();
            string query = "SELECT * FROM products";

            MySqlConnection con = new MySqlConnection(); 
            con.ConnectionString = conString;
            try { 
                con.Open();
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();
                
                while (reader.Read())
                {
                    int id = int.Parse(reader["id"].ToString());
                    string name = reader["name"].ToString();
                    string description = reader["description"].ToString();
                    double price = double.Parse(reader["price"].ToString());
                    int quantity = int.Parse(reader["quantity"].ToString());
                    Category category = Enum.Parse<Category>(reader["category"].ToString(),ignoreCase:true);

                    Product product = new Product
                    {
                        Id = id,
                        Name = name,
                        Description = description,
                        Price = price,
                        Quantity = quantity,
                        ProductCategory = category,
                    };

                    products.Add(product);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                con.Close();    
            }
            return products;
        }
    }
}