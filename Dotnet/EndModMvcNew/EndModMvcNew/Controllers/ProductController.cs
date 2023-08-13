using Microsoft.AspNetCore.Mvc;
using System.Data.Common;
using BOL;
using DAL;
using System.Runtime.CompilerServices;

namespace EndModMvcNew.Controllers
{
    public class ProductController : Controller
    {
        [HttpPost]
        public IActionResult AddProduct(string name, string description,double price,int quantity)
        {
            return View();

        }
        public IActionResult AddProduct()
        {
            return View();
        }
        public IActionResult List() { 
            List<Product> products=DBManager.GetProducts();
            this.ViewData["products"] = products;
            return View();
        }
    }
}
