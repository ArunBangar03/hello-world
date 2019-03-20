import java.util.Arrays;
import java.util.Comparator;

public class Employee2 {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee2(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]\n";
	}



	public static void main(String[] args) {
		Employee2[] emp = new Employee2[4];
		emp[0] = new Employee2(10, "Mikey", 25, 10000);
		emp[1] = new Employee2(20, "Arun", 30, 20000);
		emp[2] = new Employee2(5, "lisa", 55, 5000);
		emp[3] = new Employee2(1, "pankaj", 40, 50000);

		Arrays.sort(emp, new AgeComparator ());
		System.out.println("Default sorting of Employee Array - Age" + Arrays.toString(emp));
		Arrays.sort(emp, new NameComparator());
		System.out.println("Default sorting of Employee Array - Name" + Arrays.toString(emp));
		Arrays.sort(emp, new SalaryComparator());
		System.out.println("Default sorting of Employee Array -Salary" + Arrays.toString(emp));
		Arrays.sort(emp, new EmployeeByIdAndName());
		System.out.println("Default sorting of Employee Array -Salary" + Arrays.toString(emp));

	}
}

class AgeComparator implements Comparator{

	@Override
	public int compare(Object O1, Object O2) {
		Employee2 e1 = (Employee2)O1;
		Employee2 e2 = (Employee2)O2;
		// TODO Auto-generated method stub
		return e1.getAge() - e2.getAge();
	}
	
}

class NameComparator implements Comparator{

	private Object getName;

	@Override
	public int compare(Object O1, Object O2) {
		Employee2 e1 = (Employee2)O1;
		Employee2 e2 = (Employee2)O2;
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}
	
}

class SalaryComparator implements Comparator{

	@Override
	public int compare(Object O1, Object O2) {
		Employee2 e1 = (Employee2)O1;
		Employee2 e2 = (Employee2)O2;
		// TODO Auto-generated method stub
		return (int) (e1.getSalary() - e2.getSalary());
	}
	
}

class EmployeeByIdAndName implements Comparator{
	public int compare (Object O1, Object O2) {
		Employee2 e1 = (Employee2)O1;
		Employee2 e2 = (Employee2)O2;
		int flag = e1.getId() - e2.getId();
		if (flag==0)
			flag = e1.getName().compareTo(e2.getName());
		return flag;
	}
}