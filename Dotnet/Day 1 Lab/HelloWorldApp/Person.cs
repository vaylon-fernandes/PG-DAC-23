namespace HR;

public class Person
{
    private string firstName;
    private string lastName;
    private DateTime dob;
    private string contactNumber;
    private string email;

    public string GetFirstName()
    {
        return this.firstName;
    }

    public void SetLastName(string lastName)
    {
        this.lastName = lastName;
    }

    //property syntax
    public string FirstName
    {
        get { return this.firstName; }
        set { this.firstName = value; }
    }

    // constructor 
    public Person() { }

    public Person(string firstName, string lastName, DateTime dob, string contactNumber, string email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // override ToString 

    public override string ToString()
    {
        return base.ToString() + " " + this.firstName + " " + this.lastName + " " + this.dob + " " + this.contactNumber + " " + this.email;
    }

    // GC calls destructor 
    ~Person() { }

}