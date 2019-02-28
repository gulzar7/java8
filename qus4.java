interface MyInterface6
{
	Employee employee(String name,Integer age, String city);

}

class Employee{
	String name,city;
	int age;

	public Employee(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", city='" + city + '\'' +
				", age=" + age +
				'}';
	}
}
class Foo
{
	public static void main(String[] args) {

		MyInterface6 obj1 = Employee::new;
		System.out.println(obj1.employee("Gulzar",21,"Basti"));




	}
}