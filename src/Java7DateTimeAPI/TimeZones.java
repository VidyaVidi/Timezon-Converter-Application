package Java7DateTimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;


public class TimeZones
{
	public static void main(String args[]) throws ParseException
	{
		System.out.println("Enter the Input Time Zone: ");
		Scanner scan=new Scanner(System.in);
		String inputZone=scan.nextLine();
		
		System.out.println("Enter the Time to convert(format: dd-M-yyyy hh:mm:ss a): ");
		String datetime=scan.nextLine();
		
		System.out.println("Enter the Output Time Zone: ");
		String outputZone=scan.nextLine();
		
		/*
		
		
		Calendar localtime=Calendar.getInstance();
		int hr=localtime.get(Calendar.HOUR_OF_DAY);
		int min=localtime.get(Calendar.MINUTE);
		int sec=localtime.get(Calendar.SECOND);
		
		System.out.println(hr+":"+min+":"+sec);
		*/
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		Date date=sdf.parse(datetime);
		TimeZone tz1=TimeZone.getTimeZone(inputZone);
		sdf.setTimeZone(tz1);
		
		
		Calendar inputCal=new GregorianCalendar();
		inputCal.setTimeZone(tz1);
		inputCal.setTime(date);
		
		System.out.println("\nTimeZone : " + tz1.getID() + " - " + tz1.getDisplayName()+" "+tz1.getOffset(inputCal.getTimeInMillis()));
		System.out.println("Date: " + sdf.format(inputCal.getTime()));
		//System.out.println("Time in "+tz1.getID()+"- "+ sdf.format(inputCal.getTime()));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		Calendar outputCal=new GregorianCalendar();
		TimeZone tz2=TimeZone.getTimeZone(outputZone);
		outputCal.setTime(date);
		outputCal.setTimeZone(tz2);
		sdf2.setTimeZone(tz2);
		
		//System.out.println("Time in "+tz2.getID()+"- "+ sdf.format(outputCal.getTime()));
		System.out.println("\nTimeZone : " + tz2.getID() + " - " + tz2.getDisplayName());
		System.out.println("Date: " + sdf2.format(outputCal.getTime()));
		
		
	}
}
