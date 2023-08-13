using BOL;
using DAL;
namespace BLL
{
    public class CatalogManager
    {
        public List<Product> getAllProducts()
        {
            List<Product> products = DBManager.GetProducts();
            return products;
        }
    }
}