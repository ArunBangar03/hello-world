import java.util.Arrays;

//Sort an Array of Object -  For custamize  - it gets class cast exception
//return (this.name.compareTo(emp.name)) - for string data type

public class Employee implements Comparable {

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

	public Employee(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]\n";
	}

	
	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		// TODO Auto-generated method stub
//		return (this.name.compareTo(emp.name));
		return (this.id - emp.id);
	}

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(10, "Mikey", 25, 10000);
		emp[1] = new Employee(20, "Arun", 30, 20000);
		emp[2] = new Employee(5, "lisa", 55, 5000);
		emp[3] = new Employee(1, "pankaj", 40, 50000);

		Arrays.sort(emp);
		System.out.println("Default sorting of Employee Array" + Arrays.toString(emp));
	}

}
