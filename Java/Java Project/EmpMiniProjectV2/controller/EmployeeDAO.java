package Controller;

import Model.Employee;
import Model.Admin;
import Model.HR;
import Model.SalesManager;
import java.util.*;


public class EmployeeDAO {
	
	 
		 ArrayList<Employee> eArr = new ArrayList<>();

			// default records
			public EmployeeDAO() {
				eArr.add(new Admin(105, "Akshu", 60000.0, 5000.0));
				eArr.add(new HR(184, "ABC", 45000.0, 2500.0));
				eArr.add(new SalesManager(103, "XYZ", 48000.0, 50, 7000.0));
				eArr.add(new HR(254, "PQR", 47000.0, 2000.0));
				eArr.add(new Admin(158, "aaabb", 52000.0, 3000.0));
			}

	public boolean addEmployee(Employee e) {
		
		return eArr.add(e);
		
	}

	public Employee searchEmployee(int id) {
		
		for (Employee e : eArr) {
			if (e.getId() == id) {
                return e;
            }
        }
        return null;
		
		
	}

	public boolean updateEmployee(int id,double salary) {
		for (Employee e : eArr) {
			if (e.getId() == id) {
				e.setSalary(salary);
				return true;
			}
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		for (int i = 0; i < eArr.size(); i++) {
			if (eArr.get(i).getId() == id) {
				eArr.remove(i);
				return true;
            }
        }
        return false;
		
	}

	public void displayAll() {
			System.out.println(eArr);
           }
	
	
	public class MyIdComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId()-o2.getId();
		}
	}
	
	public class MyNameComparator implements Comparator<Employee>{

		

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getName().compareTo(o2.getName());
		}

	}
	
	public class MySalaryComparator implements Comparator<Employee>{

		

		
		public int compare(Employee o1, Employee o2) {

			return (int) (o1.getSalary()-o2.getSalary());
		}

	}
	

	
	public void sortEmployee(int choice) {

		switch (choice) {
		case 0:
			System.out.println("Exited");
			break;
		case 1:
			MyIdComparator mic = new MyIdComparator();
			Collections.sort(eArr, mic);
			break;
		case 2:
			MyNameComparator mnc = new MyNameComparator();
			Collections.sort(eArr, mnc);
			break;
		case 3:
			MySalaryComparator msc = new MySalaryComparator();
			Collections.sort(eArr, msc);
			break;

		}
		System.out.println(eArr);

	}

}
