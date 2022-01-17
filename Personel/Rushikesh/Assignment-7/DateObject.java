// Java program to create a Current Date object using the Calendar class.

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateObject 
{
  public static void main(String[] args)
  {
   //getting current date and time using Date class

    DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date obj = new Date();

    System.out.println(dfor.format(obj));

    /*getting current date time using calendar class 
    *An Alternative of above*/

    Calendar cobj = Calendar.getInstance();
    System.out.println(dfor.format(cobj.getTime()));
  }
} 
