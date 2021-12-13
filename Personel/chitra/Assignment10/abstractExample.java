abstract class parentClass
{
	parentClass()
	{
		System.out.println("This is constructor of abstract class  ");
	}
	abstract void a_method();
	void print()
	{
		System.out.println("This is a normal method of abstract class");
	}
}
class subClass extends parentClass{
	
	void a_method()
	{
		System.out.println("This is abstract method ");
	}
}
public class abstractExample {

	public static void main(String[] args) {
		
		subClass s = new subClass();
		s.print();
		s.a_method();
		
	}

}
