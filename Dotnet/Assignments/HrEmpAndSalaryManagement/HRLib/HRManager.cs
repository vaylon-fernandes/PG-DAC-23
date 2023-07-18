namespace HRLib
{
    public class HRManager : Employee
    {
        private double perfBonus { get; set; }

        public HRManager() : base()
        {
            this.perfBonus = 0;
        }

        public HRManager(int empId, string empName, int empAge, DateOnly joinDate, Department dept, double basicSalary, double perfBonus) 
            : base(empId, empName, empAge, joinDate, dept, basicSalary) {
            this.perfBonus = perfBonus;
        }

        public override string ToString()
        {
            string data = $"{base.ToString()} Performance bonus: {perfBonus}";
            return data;
        }
    }   
    }
