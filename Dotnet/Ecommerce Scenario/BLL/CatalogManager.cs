using BOL;
using DAL;

namespace BLL
{
    public class CatalogManager
    {
        public List<Product> GetAllProducts()
        {
            List<Product> allProducts =  DBManager.getAllProducts();
            // apply tax on the products 
            return allProducts;
        }

        public Product GetProduct(int id)
        {
            Product product = DBManager.getProduct(id);
            return product;
        }
    }
}