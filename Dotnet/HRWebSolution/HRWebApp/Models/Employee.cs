namespace HRWebApp.Models
{
    [Serializable]
    public class Employee
    {
        public Employee(string id, string name, string email, string phoneNumber, string address, string department, string password)
        {
            Id = id;
            Name = name;
            Email = email;
            PhoneNumber = phoneNumber;
            Address = address;
            Department = department;
            Password = password;
        }
        public Employee(){
            Id = string.Empty;
            Name = string.Empty;
            Email = string.Empty;
            PhoneNumber = string.Empty;
            Address = string.Empty;
            Department = string.Empty;
            Password = string.Empty;
            }

        public string Id { get; set; }
        public string Name { get; set; }
        public string Email { get; set; }
        public string PhoneNumber { get; set; } = string.Empty;
        public string Address { get; set; }
        public string Department { get; set; }
        public string Password { get; set; }
    }
}
