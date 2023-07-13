using Microsoft.VisualBasic;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ecommerce
{
    internal class Dashboard:IOrderDetails, ICustomerDetails, IDisposable
    {
        #region Data Members
            private int financialYear;
            private string department;
            private bool disposedValue;
        private bool disposedValue1;
        #endregion

        #region Property
        public int FinancialYear {
            get{
                return this.financialYear;
            }
            set{
                this.financialYear = value;
            }
        }
        
        #endregion

        #region member functions
        void IOrderDetails.ShowDetails()
        {
            Console.WriteLine("Order details");
        }

        void ICustomerDetails.ShowDetails()
        {
            Console.WriteLine("Customer Details");
        }
        #endregion

        // Destructor: clean resources before object goes out of memory
        ~Dashboard() { }

        protected virtual void Dispose(bool disposing)
        {
            if (!disposedValue1)
            {
                if (disposing)
                {
                    // TODO: dispose managed state (managed objects)
                }

                // TODO: free unmanaged resources (unmanaged objects) and override finalizer
                // TODO: set large fields to null
                disposedValue1 = true;
            }
        }

        // // TODO: override finalizer only if 'Dispose(bool disposing)' has code to free unmanaged resources
        // ~Dashboard()
        // {
        //     // Do not change this code. Put cleanup code in 'Dispose(bool disposing)' method
        //     Dispose(disposing: false);
        // }

        void IDisposable.Dispose()
        {
            // Do not change this code. Put cleanup code in 'Dispose(bool disposing)' method
            Dispose(disposing: true);
            GC.SuppressFinalize(this);
        }
    }

}
