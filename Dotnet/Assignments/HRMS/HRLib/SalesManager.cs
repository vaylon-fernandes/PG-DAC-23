using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Taxation;
using static Taxation.Dispatcher;

namespace HRLib
{
    public class SalesManager:Employee
    {
        private double professionalTaxPercent { get; set; }
        private double incomeTaxPercent { get; set; }
        public double perfBonus { get; set; }

        public SalesManager(int empId, string firstName, string lastName, string department, double salary, double perfBonus=0) 
            : base(empId, firstName, lastName, department, salary)
        {
            this.perfBonus = perfBonus;
            this.professionalTaxPercent = 10;
            this.incomeTaxPercent = 20;
        }
        public override string ToString()
        {
            string data = string.Format("{0} Bonus: {1}", base.ToString(), this.perfBonus);
            return data;
        }

        public override void computeSalary(TaxOperation operation)
        {
            this.salary = this.salary+this.perfBonus
                -operation(this.salary, this.professionalTaxPercent)
                -operation(this.salary,this.incomeTaxPercent);
        }

    }
}
