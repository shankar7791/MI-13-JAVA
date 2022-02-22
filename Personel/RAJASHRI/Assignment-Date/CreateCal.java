import java.util.Calendar;

public class CreateCal {

	public static void main(String[] args) 
	{

    int year = 1993;
    int month = 6;
    int date = 26;

    Calendar cal = Calendar.getInstance();
   
    cal.clear();

    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, month);
    cal.set(Calendar.DATE, date);

    java.util.Date utilDate = cal.getTime();
    System.out.println(utilDate);
  }

}


