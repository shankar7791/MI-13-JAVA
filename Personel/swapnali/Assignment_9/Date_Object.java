/*......WAP to create a Date Object using the calendar class......*/

import java.util.*;
public class Date_Object 
{
    public static void main(String[] args)
    {
     
     Calendar cal = Calendar.getInstance();
     
     System.out.println("Year : " +cal.get(Calendar.YEAR));
     cal.set(Calendar.MONTH, 10);
     cal.set(Calendar.DATE, 21);

     System.out.println(cal.getTime());
    }
}
