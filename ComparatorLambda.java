import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ComparatorLambda {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,5,6,7,8,1,2,3,5);
		
		List<Employee> e  = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Amitname");
		Employee e2 = new Employee(2, "Zmitname");
		Employee e3 = new Employee(13, "Dmitname");
		Employee e4 = new Employee(42, "Qmitname");
		Employee e5 = new Employee(5, "Kmitname");
		
		e.add(e1);e.add(e2);e.add(e3);e.add(e4);e.add(e5);
		
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				o1.compareTo(o2);
				return 0;
			}
		};
		
		Comparator<Employee> ctr = ((o1, o2) -> {
			if(o1.getAge() < o2.getAge())
				return -1;
			else if(o1.getAge() > o2.getAge())
				return 1;
			else 
				return 0;
			
		});
		
		Comparator<Employee> ctr2 = ((o1, o2) -> {
			
			return o2.getName().compareTo(o1.getName());
		});
		
		
		Collections.sort(l1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2)
					return -1;
				else if(o1 > o2)
					return 1;
				else 
					return 0;
			}
		});
		System.out.println("((((((" +l1);
		
		Collections.sort(e, ctr2);
			
		
		System.out.println("lllll"+e.toString());
		
	
		Comparator<Employee> ctr1 = (e10, e20) -> e10.getName().compareTo(e20.getName());
		
		Collections.sort(e,ctr);
		System.out.println(e.toString());

		Consumer<Employee> c1= (s) -> System.out.println(s);
		Consumer<Integer> c2= (s) -> System.out.println(s);
		Consumer<Integer> c3= (s) -> System.out.println(s.highestOneBit(0));
		
		l1.forEach(c2.andThen(c3));;
//	      Comparator<Employee> compareByName = Comparator
//                  .comparing(Employee::getAge);
//                  //.thenComparing(Employee::getName);
//
//	      List<Employee> sortedEmployees = e.stream()
//          .sorted(compareByName)
//          .collect(Collectors.toList());
//	      
//	      System.out.println(sortedEmployees.toString());
	      
	}

}

class Employee{
	
	int age;
	String name;
	List<String> activities;
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
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
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}
