import java.util.Scanner;

abstract class Marks{
	
	abstract float getPercentage();
}

class StudentA_Marks extends Marks{
	
	float sub1,sub2,sub3;
	
	StudentA_Marks(float sub1,float sub2,float sub3)
	{
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}
	float getPercentage() {
		
		System.out.println("\n\nsubject1 : " + sub1 + "\nsubject2 : " + sub2 + "\nsubject3 : " + sub3);
		float per = (sub1+sub2+sub3)/3;
		return per;
	}
	
}
class StudentB_Marks extends Marks{
	
	float sub1,sub2,sub3,sub4;
	
	StudentB_Marks(float sub1,float sub2,float sub3,float sub4)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
        this.sub4 = sub4;
	}
	float getPercentage() {
		
		System.out.println("\n\nsubject1 : " + sub1 + "\nsubject2 : " + sub2 + "\nsubject3 : " + sub3 + "\nsubject4 : " + sub4);
		float per = (sub1+sub2+sub3+sub4)/4;
		return per;
	}
	
}
public class abstractPercentageExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of student A is : ");
		System.out.println("Subject 1 : ");
		float sub1 = sc.nextFloat();
		System.out.println("Subject 2 : ");
		float sub2 = sc.nextFloat();
		System.out.println("Subject 3 : ");
		float sub3 = sc.nextFloat();
		
		System.out.println("Enter marks of student B is : ");
		System.out.println("Subject 1 : ");
		float sub_1 = sc.nextFloat();
		System.out.println("Subject 2 : ");
		float sub_2 = sc.nextFloat();
		System.out.println("Subject 3 : ");
		float sub_3 = sc.nextFloat();
		System.out.println("Subject 4 : ");
		float sub_4 = sc.nextFloat();
		
		StudentA_Marks A = new StudentA_Marks(sub1,sub2,sub3);
		StudentB_Marks B = new StudentB_Marks(sub_1,sub_2,sub_3,sub_4);
		
		System.out.println("Percentage of student A is : " + A.getPercentage());
		System.out.println("Percentage of student B is : " + B.getPercentage());
		
	}

}
