
public class RelationalOp {

	public static void main(String[] args)
   { 
		int x,temp;
		int y,z;
		temp=10;
		x=5;
		y=20;
		z=y;		//assignment operator
		if(y==z)     
		{
			System.out.println("Y and Z are same");
		}
		if(y!=x)         
		{
			System.out.println("Y and x are not same");
		}
		if(x<temp && x<y) //Logical &&
		{
			System.out.println("X is smallest");
		}
		while(x>=1)
		{
				System.out.println(x);
			x--;	
		}
		 
		
				
		
		
	}

}
