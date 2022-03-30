package week_1_practicalExam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		Employee emp1 = new Employee(1, "Roushan", 20000.0);
		Employee emp2 = new Employee(12, "Rohini", 1500.0);
		
		Class classEmployee = Employee.class;
		Method method[] = classEmployee.getDeclaredMethods();
		
		for(int i=0;i<method.length;i++)
			System.out.println(method[i]);
		
		Field nameField = classEmployee.getDeclaredField("name");
		nameField.setAccessible(true);
		System.out.println("Name = " + nameField.get(emp1));
		System.out.println("Name = " + nameField.get(emp2));


	}

}
