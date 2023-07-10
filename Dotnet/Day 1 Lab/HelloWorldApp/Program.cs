using Stud;
// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");

DateTime regDate = new DateTime(2023, 09, 23);
DateTime birthDate = new DateTime(1998, 12, 12);
Student std = new Student(76, "DAC", regDate, "FirstName", "Last Name", birthDate, "1234567890", "some@domain.com");

// Stud.Student std1 = new Stud.Student()
Console.WriteLine(std);