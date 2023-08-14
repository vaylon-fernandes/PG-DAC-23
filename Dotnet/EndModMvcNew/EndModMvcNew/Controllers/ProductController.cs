using Microsoft.AspNetCore.Mvc;
using System.Data.Common;
using BOL;
using DAL;
using System.Runtime.CompilerServices;
using BLL;


namespace EndModMvcNew.Controllers
{
    public class ProductController : Controller
    {
        [HttpGet]
        public IActionResult Index()
        {
            CatalogManager catalogManager = new CatalogManager();
            List<BOL.Product> products = catalogManager.getAllProducts(); 
            this.ViewData["products"] = products;
            return View();
        }
        
        [HttpGet("/product/get/{id}")]
        public IActionResult GetProduct(int id) {
            BOL.Product product = DBManager.GetProduct(id);
            if (product == null) { 
                return View();
            }
            this.ViewData["product"] = product;
            return View();
        }


        public IActionResult AddProduct()
        {
            Models.Product product = new Models.Product();
            return View(product);
        }
        [HttpPost]
        public IActionResult AddProduct(Product prod) {
            /*if (prod == null)
            {
                return View();
            }*/
            if (!ModelState.IsValid)
            {
                return View();
            }
            bool v = DBManager.AddProduct(prod);
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult UpdateProduct(int id) {
            Product prod = DBManager.GetProduct(id);
            if (prod == null)
            {
                return View();
            }
            this.ViewData["product"] = prod;
            return View();
        }

        [HttpPost]
        public IActionResult UpdateProduct(int id, string name, string description, double price, int quantity, Category productCategory)
        {
            Product updateProduct = new Product(id, name, description, price, quantity, productCategory);
            DBManager.updateProduct(updateProduct);
            return RedirectToAction("Index");
        }
        [HttpGet("/product/DeleteProductByName/{name}")]
        public IActionResult DeleteProductByName(string name) {
            Console.WriteLine(name);
            bool ret = DBManager.deleteProductByName(name);
            if(ret)
            {
                return RedirectToAction("Index");
            }
            return View();
        }
    }
}
