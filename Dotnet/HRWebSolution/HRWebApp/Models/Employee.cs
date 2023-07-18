namespace HRWebApp.Models
{
    [Serializable]
    public class Employee
    {
        public Employee(int id, string name, string email, string phoneNumber, string address, string department)
        {
            Id = id;
            Name = name;
            Email = email;
            PhoneNumber = phoneNumber;
            Address = address;
            Department = department;
        }
        public Employee(){
            Id = 0;
            Name = string.Empty;
            Email = string.Empty;
            PhoneNumber = string.Empty;
            Address = string.Empty;
            Department = string.Empty;
            }

        public int Id { get; set; }
        public string Name { get; set; }
        public string Email { get; set; }
        public string PhoneNumber { get; set; } = string.Empty;
        public string Address { get; set; }
        public string Department { get; set; }
    }
}
