
class compny{
	int salary = 40000;
}

class employee extends compny {

	int hike = 5;
}

class employeeB extends compny{
	
	int hike = 4;
}
  
class Main {
	
	public static void main(String[] args) {
		employee obj1 = new employee();
		employeeB obj2 = new employeeB();
		
		System.out.println("EmployeeA salary is : " + obj1.salary);
		System.out.println("EmployeeA hike is : " + obj1.hike);
		System.out.println("EmployeeB salary is : " + obj2.salary);
		System.out.println("EmployeeB hike is : " + obj2.hike);
		
		
		

	}
}

