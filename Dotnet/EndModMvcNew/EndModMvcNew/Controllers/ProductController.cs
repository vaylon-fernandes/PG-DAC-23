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
            List<Product> products = catalogManager.getAllProducts(); 
            this.ViewData["products"] = products;
            return View();
        }
        public IActionResult AddProduct()
        {
            return View();
        }
        [HttpPost]
        public IActionResult AddProduct(Product prod) {
            if (prod == null)
            {
                return View();
            }
            DBManager.AddProduct(prod);
            return RedirectToAction("Index");
        }
        
    }
}
