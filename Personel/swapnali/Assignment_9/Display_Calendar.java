
/*......WAP to get and display information of a default calendar*/

import java.util.*;
public class Display_Calendar
{
	public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
       
	    
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        
        System.out.println("Day: " + cal.get(Calendar.DATE));
        
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
       
    }
}
