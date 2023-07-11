namespace emp;
class Employee{
    private static int counter;
    private int empid;
    private string name; 
    private string email; 
    private string contactNumber;
    private double basic; 
    private double hra; 
    private double pf;


    public Employee(){
       
    }

    public Employee(string name, string email, string contactNumber, double basic, double hra, double pf){
        this.empid = counter++;
        this.name = name; 
        this.email = email;
        this.contactNumber = contactNumber;
        this.basic = basic; 
        this.hra = hra;
        this.pf = pf;
    }

    public override string ToString()
    {
        return $"Name:{name} Email:{email} Contact Number: {contactNumber} Basic: {basic} HRA: {hra} Pf: {pf}";
    }

    public virtual double ComputeSalary(){
        return basic + hra - pf;
    }

    //  public string Name{
    //     get {return name;}
    //     set {this.name = name;}

    //  } 

     
     public double Basic{
        get {return basic;}
        set {this.basic=value;}
     }

public double GetBasic{
        get {return basic;}
 set {this.basic=value;}
     }

}