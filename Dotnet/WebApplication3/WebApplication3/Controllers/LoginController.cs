using Microsoft.AspNetCore.Mvc;

namespace WebApplication3.Controllers
{
    public class LoginController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Index(string user, string pass) { 
            if(user == "a" && pass == "p")
            {
                return RedirectToAction("Index","Movies");
            }
            return View();
        }
        [HttpPost]
        public IActionResult Index1(string user1, string password)
        {
            if (user1 == "b" && password == "a")
            {
                return RedirectToAction("Index", "Movies");
            }
            return View();
        }
    }
}
