import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateLambda {

	static java.util.function.Predicate<Integer> p=  i -> i%2==0 ;
	
	public static void main(String[] args) {
		
	List<Integer> l1 = Arrays.asList(1,2,3,5,6,7,8,1,2,3,5);
		
		List<Employee> e  = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Amitname");
		Employee e2 = new Employee(2, "Zmitname");
		Employee e3 = new Employee(13, "Dmitname");
		Employee e4 = new Employee(42, "Qmitname");
		Employee e5 = new Employee(5, "Kmitname");
		
		e.add(e1);e.add(e2);e.add(e3);e.add(e4);e.add(e5);
		
		List<String> names = e.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Name " + names.toString());
		
		System.out.println("Sorted");
		sort(e).forEach(System.out::println);;
		
		
		l1.forEach(l ->{
			if(p.test(l))
			System.out.println(l);;
		});
		
		
		 Supplier<List<Employee>> supplier = () -> e;

		List<Employee> l2 = supplier.get();
		System.out.println(l2.toString());
		
		Function<String, String> f1 = (s) -> s.toUpperCase();
		Function<String, String> f2 = String::toUpperCase;
		
		List<Integer> l4 = l1.stream().filter(p).collect(Collectors.toList());
		System.out.println("L4 " + l4.toString());
		
	}

	private static Stream<Employee> sort(List<Employee> e) {
		
		return e.stream().sorted(Comparator.comparing(Employee::getAge).reversed());
		
	}
		

	}
	
	class Employee1{
		
		int age;
		String name;
		@Override
		public String toString() {
			return "Employee [age=" + age + ", name=" + name + "]";
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public Employee1(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		

}
