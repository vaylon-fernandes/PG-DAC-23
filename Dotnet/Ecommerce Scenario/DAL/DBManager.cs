using BOL;
using MySql.Data.MySqlClient;

namespace DAL
{
    public class DBManager
    {
        public static string conString = @"server=localhost;port=3306;user=root;password=root123;database=dotnetworld";

        public static List<Product> getAllProducts()
        {
            List<Product> products = new List<Product>();
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                // establish connection 
                mySqlConnection.Open();
                // fire query to database 
                MySqlCommand command = new MySqlCommand();
                command.Connection = mySqlConnection;
                string query = "SELECT * FROM products";
                command.CommandText = query;
                MySqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["id"].ToString());
                    string name = reader["name"].ToString();
                    string description = reader["description"].ToString();
                    double price = double.Parse(reader["price"].ToString()) ;
                    int quantity = int.Parse(reader["quantity"].ToString());
                    Category productCategory = Enum.Parse<Category>(reader["category"].ToString(),ignoreCase:true);
                    Product newProduct = new Product
                    {
                        Id = id,
                        Name = name,
                        Description = description,
                        Price = price,
                        Quantity = quantity,
                        ProductCategory = productCategory
                    };
                    Console.WriteLine(newProduct);

                    products.Add(newProduct);
                }               
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { mySqlConnection.Close(); }

            return products;
        }

        public static Product getProduct(int id)
        {
            Product product = null;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                mySqlConnection.Open();
                MySqlCommand command = new MySqlCommand();
                command.Connection = mySqlConnection;
                string query = $"SELECT * FROM products WHERE ID={id}";
                command.CommandText = query;
                MySqlDataReader reader = command.ExecuteReader();

                if(reader.Read())
                {
                    id = int.Parse(reader["id"].ToString());
                    string name = reader["name"].ToString();
                    string description = reader["description"].ToString();
                    double price = double.Parse(reader["price"].ToString());
                    int quantity = int.Parse(reader["quantity"].ToString());
                    Category productCategory = Enum.Parse<Category>(reader["category"].ToString(), ignoreCase: true);
                    product = new Product
                    {
                        Id = id,
                        Name = name,
                        Description = description,
                        Price = price,
                        Quantity = quantity,
                        ProductCategory = productCategory
                    };
                }

            } catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                mySqlConnection.Close();
            }
            return product;
        }
        public static bool InsertProduct(Product product)
        {
            bool status = false;

            if (product != null)
            {
                status = true;
                MySqlConnection mySqlConnection = new MySqlConnection();
                mySqlConnection.ConnectionString = conString;
                try
                {
                    mySqlConnection.Open();
                    MySqlCommand command = new MySqlCommand();
                    command.Connection = mySqlConnection;
                    string query = $"INSERT INTO products (id, name, description, category, price, quantity) " +
                        $"VALUES ({product.Id}, '{product.Name}', '{product.Description}', " +
                        $"'{product.ProductCategory}', {product.Price}, {product.Quantity})";
                    command.CommandText = query;
                    command.ExecuteNonQuery();
                    status = true;
                }
                catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                        }
                finally {
                    mySqlConnection.Close();
                }
            }

            return status;
        }
        public static bool UpdateProduct(Product product)
        {
            bool status = false;

            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                mySqlConnection.Open();
                MySqlCommand command = new MySqlCommand();
                command.Connection = mySqlConnection;
                string query = $"UPDATE products " +
                    $"SET name='{product.Name}'," +
                         $"description='{product.Description}'," +
                         $"price={product.Price}," +
                         $"quantity={product.Quantity}," +
                         $"category='{product.ProductCategory}' " +
                         $"WHERE id = {product.Id}";
                command.CommandText = query;
                command.ExecuteNonQuery();
                status = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                mySqlConnection.Close();
            }

            return status;
        }
        public static bool DeleteById(int id)
        {
            bool status = false;
            MySqlConnection mySqlConnection=new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                mySqlConnection.Open();
                MySqlCommand command = new MySqlCommand();
                command.Connection = mySqlConnection;
                string query = $"DELETE FROM products WHERE id={id}";
                command.CommandText = query;
                command.ExecuteNonQuery();
            }
            catch (Exception ex) { Console.WriteLine(ex.Message); }
            finally { mySqlConnection.Close(); }
            return status;
        }
    }
}
