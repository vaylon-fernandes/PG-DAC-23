using BOL;
using Microsoft.AspNetCore.Mvc;



namespace HRWebAPI.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class EmployeeController : Controller
    {
        private ILogger<Employee> _logger;
        public EmployeeController(ILogger<Employee> logger)
        {
            _logger = logger;
        }
        public IActionResult Index()
        {
            return View();
        }
    }
}
