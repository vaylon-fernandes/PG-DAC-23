using HRWebApp.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using BOL;
using BLL;
using DAL.Connected;

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
        public IActionResult Register() {
            return View();
        }
        [HttpPost]
        public IActionResult Register(int empid, string name, string department, string phonenumber, string email,
            int salary, string address, string password) {
            Employee employee = new Employee();
            employee.Id = empid;
            employee.Name = name;
            employee.Department = department;
            employee.Email = email;
            employee.PhoneNumber = phonenumber;
            employee.Address = address;
            employee.Salary = salary;
            employee.Password = password;
            HRDbManager.Insert(employee);
            return RedirectToAction("Index", "Employee");
        }

        

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}