using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Account;

namespace HRLib
{
    public  class Employee:ISalaryPayable
    {


        private int empId { get; set; }
        private string empName { get; set; } = string.Empty;
        private int empAge { get; set; }
        private DateOnly joinDate { get; set; }
        private Department dept { get; set; }
        private double basicSalary { get; set; }
        private double pf { get; set; }
        private double hra { get; set; }

        public Employee()
        {
            this.empId = 0;
            this.empName = "Defaulr";
            this.empAge = 21;
            this.joinDate = DateOnly.FromDateTime(DateTime.Now);
            this.dept = Department.TRAINEE;
            this.basicSalary = 10000;
            this.pf = 1000;
            this.hra = 500;
        }
        public Employee(int empId, string empName, int empAge, DateOnly joinDate, Department dept, double basicSalary)
        {
            this.empId = empId;
            this.empName = empName;
            this.empAge = empAge;
            this.joinDate = joinDate;
            this.dept = dept;
            this.basicSalary = basicSalary;
            this.pf = 0.1*basicSalary;
            this.hra = 0.05*basicSalary;
        }

        public double computeSalary()
        {
            return basicSalary - pf + hra;
        }

        public override string ToString()
        {
            string data = $"EmpID; {empId} Name: {empName} Age:{empAge} Join Date: {joinDate} " +
                $"Department: {dept} Basic Salary:{basicSalary} PF:{pf} HRA:{hra}";
            return data;
        }
    }
}
