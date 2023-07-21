using BLL;
using BOL;
using DAL.Connected;
using Microsoft.AspNetCore.Mvc;
using Org.BouncyCastle.Bcpg;

namespace HRWebApp.Controllers
{
    public class AuthController : Controller
    {
        private readonly ILogger<AuthController> _logger;

        public AuthController(ILogger<AuthController> logger)
        {
            _logger = logger;
        }

        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string email, string password)
        {
            HRManager mgr = new HRManager();
            List<Employee> employee = mgr.getAllEmployees();
            bool findEmp = employee.Exists(emp => emp.Email == email && emp.Password == password);
            if (findEmp)
            {
                return RedirectToAction("index", "employee");
            }

            return View();
        }
    }
}
