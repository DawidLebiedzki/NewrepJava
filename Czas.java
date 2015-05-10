import java.util.Calendar;
import java.util.GregorianCalendar;


public class Czas 
{

	public static void main(String[] args) 
	{
		GregorianCalendar dzis = new GregorianCalendar();
		
		int tydzienRoku = dzis.get(Calendar.WEEK_OF_YEAR);
		System.out.println(tydzienRoku);
		System.out.printf("%tc", dzis);
	}

}

