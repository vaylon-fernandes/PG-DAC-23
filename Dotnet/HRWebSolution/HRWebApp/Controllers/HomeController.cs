using HRWebApp.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using System.IO;
using System.Text.Json;
using System.Text.Json.Serialization;


namespace HRWebApp.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [HttpGet]
        public IActionResult Register()
        {
            return View();
        }
        List<Employee> roster = new List<Employee>();
        [HttpPost]
        public IActionResult Register(int id, string name, string email, string phoneNumber, string address, string department)
        {
            Employee emp = new Employee();
            emp.Id = id;
            emp.Name = name;
            emp.Email = email;
            emp.PhoneNumber = phoneNumber;
            emp.Address = address;
            emp.Department = department;

            string fileName = @Path.Combine(Path.GetTempPath(), "Roster.json");
            
            PersistEmployeeData.storeRecords(fileName, emp);

            List<Employee> list = PersistEmployeeData.readRecords(fileName);
            //Console.WriteLine("lst" + list[0]);
            return Json(list);
        }

        [HttpGet]
        public IActionResult Login() { 
            return View();
        }
        [HttpPost]
        public IActionResult Login(string email,string password)
        {
            if(email=="test@g.com" && password=="test")
            {
                Console.WriteLine("Redirecting");
                return RedirectToAction("Welcome");
            }
            Console.WriteLine(email);
            return View();
        }
       
        public IActionResult Welcome()
        {
            return View();
        }
        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}