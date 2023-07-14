using static Taxation.Dispatcher;

namespace HRLib
{
    public abstract class Employee

    {

        public int empId { get; set; }
        public string firstName { get; set; } = string.Empty;
        public string lastName { get; set; } = string.Empty;
        public string department { get; set; } = string.Empty;
        public double salary { get; set; }


        public Employee() { 
            
        }

        public Employee(int empId, string firstName, string lastName, string department, double salary)
        {
            this.empId = empId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.salary = salary;
        }

        public override string ToString()
        {
            string data = string.Format("Employee ID: {0} First Name: {1} Last Name: {2} Department: {3} Salary: {4}"
                ,empId,firstName,lastName,department,salary);
            return data;
        }

        public abstract void computeSalary(TaxOperation operation);

    }
}