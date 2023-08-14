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

        public static Product GetProduct(int id)
        {
            string query = "SELECT * FROM products where id="+id;
            Product product = null;
            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = con;
                cmd.CommandText = query;

                MySqlDataReader reader = cmd.ExecuteReader();

                if (reader.Read())
                {
                    string name = reader["name"].ToString();
                    string description = reader["description"].ToString();
                    double price = double.Parse(reader["price"].ToString());
                    int quantity = int.Parse(reader["quantity"].ToString());
                    Category category = Enum.Parse<Category>(reader["category"].ToString(), ignoreCase: true);

                    product = new Product
                    {
                        Id = id,
                        Name = name,
                        Description = description,
                        Price = price,
                        Quantity = quantity,
                        ProductCategory = category,
                    };

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
            return product;
        }

        public static bool AddProduct(Product prod)
        {
            bool status = false;
            if(prod!=null)
            {
                status = false;
                MySqlConnection con = new MySqlConnection();
                con.ConnectionString = conString;
                try
                {
                    con.Open();
                    MySqlCommand cmd = new MySqlCommand();
                    cmd.Connection = con;
                    string query = $"INSERT INTO products (id, name, description, category, price, quantity) " +
                        $"values({prod.Id},'{prod.Name}','{prod.Description}','{prod.ProductCategory}',{prod.Price},{prod.Quantity})";
                    cmd.CommandText = query;
                    cmd.ExecuteNonQuery();
                    status = true;
                }
                catch(Exception ex) { 
                    Console.WriteLine(ex.Message);
                }
                finally
                {
                    con.Close();
                }
            }
            return status; 
        }

        public static bool updateProduct(Product prod)
        {
            bool status = false;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                mySqlConnection.Open();
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = mySqlConnection;
                string query = $"UPDATE products SET name='{prod.Name}',description='{prod.Description}'," +
                    $"category='{prod.ProductCategory}',price={prod.Price},quantity={prod.Quantity} where id={prod.Id}";
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }
            finally { mySqlConnection.Close(); }

            return status;
        }

        public static bool deleteProductByName(string name) {
            bool status = false;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                mySqlConnection.Open();
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = mySqlConnection;
                Console.WriteLine(name);
                string query = $"DELETE from products where name='{name}'";
                Console.WriteLine(query);
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
                status = true;
            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }
            finally { mySqlConnection.Close(); }

            return status;
        }
        
    }
}