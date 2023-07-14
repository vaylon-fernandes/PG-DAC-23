using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Taxation
{
    public class TaxManager
    {
        private const double professionaltaxPercentage=0.10;
        private const double incomeTaxPercentage = 0.20;
    public double PayProfessionalTax(double salary)
        {
            double salAfterTax = salary-salary* professionaltaxPercentage;
            return salAfterTax;
        }
    public double PayIncomeTax(double salary)
        {
            double salAfterTax = salary - salary * incomeTaxPercentage;
            return salAfterTax;
        }
    }
}
