using BLL;
using BOL;
using DAL.Connected;
using Microsoft.AspNetCore.Mvc;

namespace HRWebApp.Controllers
{
    public class EmployeeController : Controller
    {
        public IActionResult Index()
        {
            HRManager mgr = new HRManager();
            List<Employee> employees = mgr.getAllEmployees();
            this.ViewData["employees"] = employees;
            return View();
        }
        [HttpGet]
        public IActionResult update(int id)
        {
            HRManager mgr = new HRManager();
            var employee = mgr.getEmployeeById(id);
            this.ViewData["employee"] = employee as Employee;
            return View();
        }
        [HttpPost]
        public IActionResult update(int id, string name, string department, string phonenumber, string email, 
            int salary, string address)
        {
            Employee employee = new Employee();
            employee.Id = id;
            employee.Name = name;
            employee.Department = department;
            employee.Email = email;
            employee.PhoneNumber = phonenumber;
            employee.Address = address;
            employee.Salary = salary;

            HRDbManager.Update(employee);
            
            return RedirectToAction("index", "employee");
        }
        [HttpGet] 
        public ActionResult Details(int id)
        {

            return View();
        }
        public ActionResult Fireemp(int id)
        {
            Console.WriteLine(id);
            HRManager manager = new HRManager();
            Employee empToFire = manager.getEmployeeById(id);
            if(empToFire != null)
            {
                HRDbManager.Delete(id);
                return RedirectToAction("index","employee");
            }
            return RedirectToAction("index", "employee");
        }
    }
}
