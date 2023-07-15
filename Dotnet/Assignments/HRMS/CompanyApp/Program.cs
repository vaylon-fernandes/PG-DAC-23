using HRLib;
using System.Linq.Expressions;
using Taxation;
using static HRLib.Employee;
using static Taxation.Dispatcher;


internal class Program
{
    private static void Main(string[] args)
    {
        List<Employee> list = new List<Employee>();
        Employee newEmployee = null;
        bool flag = false;
        while (!flag)
        {
            Console.WriteLine("Enter Your choice: ");
            Console.WriteLine("1. Hire Employee\n2. Show all employees:\n3. Show employee details:\n4.Remove Employee:\n5. Give Bonus\n6.Exit");
            int choice = int.Parse(Console.ReadLine());
            switch (choice)
            {
                case 1: // hire Employee
                    Console.WriteLine("Enter employee details:");
                    Console.WriteLine("Enter Employee ID:");
                    int empId = int.Parse(Console.ReadLine());
                    Console.WriteLine("Enter First Name:");
                    string empName = Console.ReadLine();
                    Console.WriteLine("Enter Last Name:");
                    string empLastName = Console.ReadLine();
                    Console.WriteLine("Enter Department:");

                    Department department = (Department)Enum.Parse(typeof(Department),Console.ReadLine(),ignoreCase:true);

                    Console.WriteLine("Enter Salary:");
                    double salary = double.Parse(Console.ReadLine());
                    Console.WriteLine("Choose Role:\n1.Sales Manager\n2.HR Manager");
                    int roleChoice = int.Parse(Console.ReadLine());
                    switch (roleChoice)
                    {
                        case 1:
                            newEmployee = new SalesManager(empId, empName, empLastName, department, salary);
                            break;
                        case 2:
                            newEmployee = new HRManager(empId, empName, empLastName, department, salary);
                            break;
                    }
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
                    Employee result = list.Find(emp => emp.empId == empIdToSearch);
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
                case 5: // assgin bonus
                    Console.WriteLine("Enter Employee Id: ");
                    int empIdToGiveBonus = int.Parse(Console.ReadLine());
                    result = list.Find(emp => emp.empId == empIdToGiveBonus);
                    if (result != null)
                    {
                        Console.WriteLine(result);
                        Console.WriteLine("Enter Bonus amount: ");
                        int bonus = int.Parse(Console.ReadLine());
                        if (result is SalesManager)
                        {
                            SalesManager salesManager = (SalesManager)result;
                            salesManager.perfBonus = bonus;
                        }
                        else if (result is HRManager)
                        {
                            HRManager hrManager = (HRManager)result;
                            hrManager.perfBonus = bonus;
                        }
                    }
                    else
                    {
                        Console.WriteLine("Employee Not Found!!");
                    }

                    break;
                case 6:
                    Console.WriteLine("Exiting");
                    flag = true;
                    break;
            }
        }
    }
}