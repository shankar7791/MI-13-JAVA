import java.util.*;
class car{
	int speed;
	String CarOwner;
	String CarType;
	String CarSold;
	
	car(int speed,String owner,String type ,String Carsold){
		this.speed = speed;
		this.CarOwner = owner;
		this.CarType = type;
		this.CarSold = Carsold;
	}
	
}
public class CarShop {

	public static void main(String[] args) {
		
	    int count = 0;
		
		car c1 = new car(300,"Nitin","SUV","Sold");
		car c2 = new car(350,"Rajashri","Sedan","Unsold");
		car c3 = new car(400,"Chitra","Hatchback","Sold");
		car c4 = new car(455,"Nishchit","MUV","Unsold");
		car c5 = new car(420,"Swapnali","Crossover","Sold");
		car c6 = new car(350,"Rajashri","Sedan","Sold");
		
         LinkedList<car> ls = new LinkedList<>();
         ls.add(c1);
         ls.add(c2);
         ls.add(c3);
         ls.add(c4);
         ls.add(c5);
         ls.add(c6);
         
         for(car c : ls) {
        	 if(c.CarSold == "Sold")
        	 {
        		count++;
        	 }
        	 System.out.println(c.speed + " " + c.CarOwner + " " + c.CarType + " " + c.CarSold);
         }
         System.out.println("\nNumber of cars sold is : " +count);
          
	}

}
