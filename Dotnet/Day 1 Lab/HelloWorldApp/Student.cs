namespace Stud;
using HR;

// Student extends Person 
class Student : Person
{
    private int prnNumber;
    private string course;
    private DateTime registrationDate;

    // static counter 
    private static int count;

    public static int GetCount()
    {
        return count;
    }

    public override string ToString()
    {
        return base.ToString() + " " + this.prnNumber + " " + this.course + " " + this.registrationDate;
    }

    // increment count for each new student
    public Student()
    {
        count++;
    }

    public Student(int prnNumber, string course, DateTime registrationDate,
        string firstName, string lastName, DateTime dob, string contactNumber, string email
    )
    : base(firstName, lastName, dob, contactNumber, email)
    {
        this.prnNumber = prnNumber;
        this.course = course;
        this.registrationDate = registrationDate;
        count++;
    }
}