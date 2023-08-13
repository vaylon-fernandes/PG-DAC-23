using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using BOL;
using MySql.Data.MySqlClient;

namespace DAL.Connected
{

    public static class HRDbManager
    {
        public static string conString = @"server=localhost;port=3306;user=root; password=root123;database=hrwebrecords";
        public static List<Employee> getAllEmployees()
        {
            List<Employee> list = new List<Employee>();
            MySqlConnection connection = new MySqlConnection();
            connection.ConnectionString = conString;
            string query = "SELECT * FROM employees";
            try
            {
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = connection;
                connection.Open();
                cmd.CommandText = query;
                MySqlDataReader reader = cmd.ExecuteReader();
                var schemaTable = reader.GetSchemaTable();

                
                while (reader.Read())
                {
                    Console.WriteLine(reader);
                    int eid = int.Parse(reader["id"].ToString());
                    double salary = double.Parse(reader["salary"].ToString());
                    string name = reader["ename"].ToString();
                    string email = reader["email"].ToString();
                    string phoneNumber = reader["phonenumber"].ToString();
                    string address = reader["address"].ToString();
                    string department = reader["department"].ToString();
                    string password = reader["password"].ToString();

                    Employee employee = new Employee
                    {
                        Id = eid,
                        Name = name,
                        Email = email,
                        PhoneNumber = phoneNumber,
                        Address = address,
                        Department = department,
                        Password = password,
                        Salary = salary,
                    };
                    list.Add(employee);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                connection.Close();
            }
            return list;
        }

        public static Employee getEmployeeId(int id)
        {
            Employee employee = null;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                string query = $"SELECT * FROM employees WHERE id={id}";
                mySqlConnection.Open();
                MySqlCommand command = new MySqlCommand(query, mySqlConnection);
                MySqlDataReader reader = command.ExecuteReader();
                if (reader.Read())
                {
                    int eid = int.Parse(reader["id"].ToString());
                    string name = reader["ename"].ToString();
                    string email = reader["email"].ToString();
                    string phoneNumber = reader["phonenumber"].ToString();
                    string address = reader["address"].ToString();
                    string department = reader["department"].ToString();
                    string password = reader["password"].ToString();
                    double salary = double.Parse(reader["salary"].ToString());

                    employee = new Employee
                    {
                        Id = eid,
                        Name = name,
                        Email = email,
                        PhoneNumber = phoneNumber,
                        Address = address,
                        Department = department,
                        Password = password,
                        Salary = salary
                    };

                }
            }
            catch(Exception e)
            {
                throw e;
            }
            finally
            {
                mySqlConnection.Close();
            }
            return employee;
        }

        

        public static bool Update(Employee employee)
        {
            bool status = false;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                string query = $"UPDATE employees SET ename='{employee.Name}', department='{employee.Department}'," +
                    $" email='{employee.Email}', phoneNumber='{employee.PhoneNumber}', address='{employee.Address}'," +
                    $"salary='{employee.Salary}' WHERE id={employee.Id}";
                MySqlCommand command = new MySqlCommand(query, mySqlConnection);
                mySqlConnection.Open();
                command.ExecuteNonQuery();
                status = true;
            }
            catch (Exception e)
            {
                throw e;
            }
            finally
            {
                mySqlConnection.Close();
            }
            return status;
        }

        public static bool Insert(Employee emp)
        {
            bool status = false;
            string query = "INSERT INTO employees(id,ename,address,department,salary,email,phoneNumber)" +
                                $"VALUES('{emp.Id}','{emp.Name}','{emp.Address}','{emp.Department}','{emp.Salary}','{emp.Email}','{emp.PhoneNumber}')";

            MySqlConnection con = new MySqlConnection();
            con.ConnectionString = conString;
            try
            {
                con.Open();
                MySqlCommand command = new MySqlCommand(query, con);
                command.ExecuteNonQuery();  //DML
                status = true;
            }
            catch (Exception e)
            {
                throw e;
            }
            finally
            {
                con.Close();
            }
            return status;
        }
        public static bool Delete(int id)
        {
            bool status = false;
            MySqlConnection mySqlConnection = new MySqlConnection();
            mySqlConnection.ConnectionString = conString;
            try
            {
                string query = $"DELETE from employees WHERE id={id}";
                MySqlCommand command = new MySqlCommand(query, mySqlConnection);
                mySqlConnection.Open();
                command.ExecuteNonQuery();
                status = true;
            }
            catch (Exception e)
            {
                throw e;
            }
            finally
            {
                mySqlConnection.Close();
            }
            return status;
        }

    }
}


