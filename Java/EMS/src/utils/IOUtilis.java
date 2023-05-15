package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.core.ems.Employee;

public interface IOUtilis {
	// static method to store Employee details to Binary file
	static void storeEmployeeDetails(String fileName, Map<String, Employee> employees) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(employees);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Employee> restoreEmployeeDetails(String fileName) throws IOException, ClassNotFoundException {
		// de ser stream: Java App<--OIS<--FIS<--Bin File
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, Employee>) in.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("File not created");
			return new HashMap<>();
		}
	}
}
