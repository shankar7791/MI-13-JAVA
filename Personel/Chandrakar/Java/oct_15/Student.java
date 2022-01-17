class School {
	String name = "AmberSoft Tech";
}



public class Student extends School {

	int Id = 10;
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		System.out.println("School name is : " + obj.name );
		System.out.println("Student Id is : " + obj.Id );
		
		
		
		
		
		

	}

}
