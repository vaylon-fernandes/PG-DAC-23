using System.Text.Json;
using System.IO;

namespace HRWebApp.Models
{
    //List<Employee> emp = new List<Employee>();
    public class PersistEmployeeData
    {
        public static void storeRecords(string fileName, List<Employee> employees)
        {

            try
            {
                var options = new JsonSerializerOptions { IncludeFields = true};
                
                string jsonString = JsonSerializer.Serialize(employees, options);
                // string fileName = @Path.Combine(Path.GetTempPath(), "Roster.json");

                // serialize 
                File.WriteAllText(fileName, jsonString); //WriteAllText(fileName, employees);
                Console.WriteLine("Stored");
            }
            catch (Exception ex) { 
                Console.WriteLine(ex.Message);
            }
        }

        public static List<Employee> readRecords(string fileName)
        {
           // List<Employee> records = new List<Employee>();
            try
            {
                // deserialise 
                string jsonString = File.ReadAllText(fileName);
                var options = new JsonSerializerOptions { IncludeFields = true };

                Console.WriteLine(jsonString);
                List<Employee> records = JsonSerializer.Deserialize<List<Employee>>(jsonString, options);
                    
                    //<List<Employee>>(jsonString);
               
                return records;

            }
            catch (Exception ex) {
                Console.WriteLine(ex.Message);
                return new List<Employee> { };
            }
        }
    }
}
