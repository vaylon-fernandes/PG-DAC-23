using BLL;
using BOL;
using DAL;
using Microsoft.AspNetCore.Mvc;

namespace Ecommerce_Scenario.Controllers
{
    public class ProductController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public ProductController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }
        //[HttpGet("DisplayProducts")]
        [HttpGet]
        public IActionResult Index()
        {
            CatalogManager catalogManager = new CatalogManager();
            List<Product> products = catalogManager.GetAllProducts();
            this.ViewData["products"] = products;
            return View();
        }

        [HttpGet("/product/{id}")]
        public IActionResult Product(int id) {
            CatalogManager catalogManager = new CatalogManager();
            Product product = catalogManager.GetProduct(id);
            this.ViewData["product"] = product; 
            return View();
        }
        [HttpGet("/product/update/{id}")]
        public IActionResult Update(int id)
        {
            CatalogManager catalogManager = new CatalogManager();
            Product findProduct = catalogManager.GetProduct(id);
            this.ViewData["product"] = findProduct;
            return View();
        }
        [HttpPost("/product/update/{id}")]
        public IActionResult Update(int id, string name, string description, double price,
            int quantity, Category productCategory)
        { 
            Product newProduct = new Product();
            newProduct.Id = id;
            newProduct.Name = name;
            newProduct.Description = description;
            newProduct.Price = price;
            newProduct.Quantity = quantity;
            newProduct.ProductCategory = productCategory;

            DBManager.UpdateProduct(newProduct);

            return RedirectToAction("Index","Product");
        }
        [HttpGet]
        public IActionResult Delete(int id)
        {
            CatalogManager catalogManager= new CatalogManager();
            Product findProduct = catalogManager.GetProduct(id);
            if (findProduct != null)
            {
                DBManager.DeleteById(id);
                return RedirectToAction("Index", "Product");
            }
            return View();
        }
    }
}
