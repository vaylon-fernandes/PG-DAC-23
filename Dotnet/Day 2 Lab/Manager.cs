namespace manager;
using emp; 

class Manager:Employee{
    private double incentives;

    public Manager(string name, string email, string contactNumber,
     double basic, double hra, double pf, double incentives)
    :base(name, email, contactNumber,  basic, hra, pf){
        this.incentives = incentives;
    }
    public override double ComputeSalary(){
        return this.GetBasic+incentives;
    }
    public override string ToString(){
        return base.ToString()+" incentives: "+this.incentives;
    } 
}