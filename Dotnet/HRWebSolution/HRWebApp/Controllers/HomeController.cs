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
        List<Employee> roster;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
            roster = PersistEmployeeData.readRecords(Path.Combine(".", "Roster.json"));
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
        [HttpPost]
        public IActionResult Register(string id, string name, string email, string phoneNumber, string address, string department, string password)
        {
            Employee emp = new Employee();
            emp.Id = id;
            emp.Name = name;
            emp.Email = email;
            emp.PhoneNumber = phoneNumber;
            emp.Address = address;
            emp.Department = department;
            emp.Password = password;

            //string fileName = @Path.Combine(Path.GetTempPath(), "Roster.json");
            string fileName = Path.Combine(".","Roster.json");
            
            roster.Add(emp);

            PersistEmployeeData.storeRecords(fileName, roster);

            List<Employee> list = PersistEmployeeData.readRecords(fileName);
            //Console.WriteLine("lst" + list[0]);
            return RedirectToAction("employeeList");
        }

        [HttpGet]
        public IActionResult EmployeeList()
        {
            return View(roster);
        }
        [HttpGet]
        public IActionResult Login() { 
            return View();
        }
        [HttpPost]
        public IActionResult Login(string email,string password)
        {
            bool findEmp = roster.Exists(emp=>emp.Email==email&&emp.Password==password);
            if(findEmp)
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