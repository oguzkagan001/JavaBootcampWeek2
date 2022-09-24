package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
	
		customer.email="oguzkagancamoglu002@gmail.com";
		System.out.println(customer.email);
		
		
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
	}

}
