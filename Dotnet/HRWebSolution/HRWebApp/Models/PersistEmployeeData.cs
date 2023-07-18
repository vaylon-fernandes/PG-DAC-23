using System.Text.Json;

namespace HRWebApp.Models
{
    //List<Employee> emp = new List<Employee>();
    public class PersistEmployeeData
    {
        public static void storeRecords(string fileName, Employee emp)
        {

            try
            {
                var options = new JsonSerializerOptions { IncludeFields = true };
                var employees = JsonSerializer.Serialize<Employee>(emp, options);
                // string fileName = @Path.Combine(Path.GetTempPath(), "Roster.json");

                // serialize 
                File.WriteAllText(fileName, employees);
                Console.WriteLine("Stored");
            }
            catch (Exception ex) { }
        }

        public static List<Employee>? readRecords(string fileName)
        {
           // List<Employee> records = new List<Employee>();
            try
            {
                // deserialise 
                string jsonString = File.ReadAllText(fileName);
                var options = new JsonSerializerOptions { IncludeFields = true };

                Console.WriteLine(jsonString);
                List<Employee> records = JsonSerializer.Deserialize<List<Employee>>(jsonString,options);
                    
                    //<List<Employee>>(jsonString);
                foreach(Employee r in records)
                {
                    Console.WriteLine("rec" + r);
                }
                Console.WriteLine("Restored");
                return records;

            }
            catch (Exception ex) {
                return new List<Employee> { };
            }
        }
    }
}
