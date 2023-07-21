using BOL;
using DAL;

namespace BLL
{
    public class HRManager
    {
        public List<Employee> getAllEmployees()
        {
            List<Employee> allEmployees = new List<Employee>();
            allEmployees = DAL.Connected.HRDbManager.getAllEmployees();
            List<Employee> storeEmployees = allEmployees;
           return storeEmployees;
        }         
        public Employee getEmployeeById(int id) {
            Employee employee = DAL.Connected.HRDbManager.getEmployeeId(id);
            return employee;
        }
    }
}