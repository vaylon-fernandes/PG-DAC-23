using HRLib;
using System.Linq.Expressions;
using Taxation;
using static Taxation.Dispatcher;

/*HR newEmp = new HR(101, "Jonh", "King", "HR", 10000,100);
//newEmp.computeSalary();
List<HR> list = new List<HR>();
list.Add(newEmp);

TaxManager taxManager = new TaxManager();

TaxOperation operation1 = new TaxOperation(taxManager.PayIncomeTax);
double sal = operation1(newEmp.salary);
newEmp.salary = sal;
newEmp.computeSalary();

Console.WriteLine(newEmp.salary);*/
List<Employee> list = new List<Employee>();
Boolean flag =false;
while (!flag)
{
    Console.WriteLine("Enter Your choice: ");
    Console.WriteLine("1. Hire Sales Manager\n2. Show all employees:\n3. Show employee details:\n4.Remove Employee:\n5.Exit");
    int choice = int.Parse(Console.ReadLine());
    switch (choice){
        case 1: // hire Sales Manager 
            Console.WriteLine("Enter employee details:");
            Console.WriteLine("Enter Employee ID:");
            int empId = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter First Name:");
            string empName = Console.ReadLine();
            Console.WriteLine("Enter Last Name:");
            string empLastName = Console.ReadLine();
            Console.WriteLine("Enter Department:");
            string department = Console.ReadLine();
            Console.WriteLine("Enter Salary:");
            double salary = double.Parse(Console.ReadLine());
            Employee newEmployee = new SalesManager(empId, empName,empLastName, department, salary);
            list.Add(newEmployee);
            Console.WriteLine("Employee added successfully");
            break;
        case 2:// display all employees
            if (list.Count > 0)
            {
                foreach (Employee emp in list)
                {
                    Console.WriteLine(emp);
                }
            }
            else
            {
                Console.WriteLine("Non employees added!!");
            }
                break;
            
        case 3: // find employee by id 
            Console.WriteLine("Enter Employee Id: ");
            int empIdToSearch = int.Parse(Console.ReadLine());
            Employee result= list.Find(emp => emp.empId == empIdToSearch);
            if (result != null)
            {
                Console.WriteLine(result);
            }
            else
            {
                Console.WriteLine("Employee Not Found!!");
            }
            break;
        case 4: // remove Employee 
            Console.WriteLine("Enter Employee Id: ");
            int empIdToDelete = int.Parse(Console.ReadLine());
            result = list.Find(emp => emp.empId == empIdToDelete);
            if (result != null)
            {
                list.Remove(result);
                Console.WriteLine("Employee Successfully Removed");
            }
            else
            {
                Console.WriteLine("Employee Not Found!!");
            }

            break;
        case 5:
            Console.WriteLine("Exiting");
            flag = true;
            break;
    }
}