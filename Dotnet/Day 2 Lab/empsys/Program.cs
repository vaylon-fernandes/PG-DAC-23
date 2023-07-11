using Hrlib;
using System;

Employee e1 = new Employee("name", "mail", "122343443", 10000, 1000, 300);
Console.WriteLine(e1);
Console.WriteLine(e1.ComputeSalary());
Manager m1 = new Manager("name", "mail", "122343443", 10000, 1000, 300, 1000);
Console.WriteLine(m1);
Console.WriteLine(m1.ComputeSalary());