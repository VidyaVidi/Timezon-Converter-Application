package com.vidya.convertTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


class TimePojo
{

	private String date;
	private String inputZoneId;
	private String outputZoneId;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInputZoneId() {
		return inputZoneId;
	}
	public void setInputZoneId(String inputZoneId) {
		this.inputZoneId = inputZoneId;
	}
	public String getOutputZoneId() {
		return outputZoneId;
	}
	public void setOutputZoneId(String outputZoneId) {
		this.outputZoneId = outputZoneId;
	}
	
	
	
}



public class CountryTimeZones {
	

	public static void main(String args[])
	{
		TimePojo tp=new TimePojo();
		DateFormat sdf1=null,sdf2=null;
		Date date1=null,date2=null;
		String time1=null,time2=null;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input Zone Id: ");
		String inputzone=scan.nextLine();
		tp.setInputZoneId(inputzone);
		
		try
		{
		System.out.println("Enter the time: ");
			
		time1 = scan.nextLine();

		 
		
		tp.setDate(time1);
			
		
		System.out.println("Enter the output Zone Id: ");
		String outputzone=scan.nextLine();
		tp.setOutputZoneId(outputzone);
		
		sdf1= new SimpleDateFormat("hh:mm:ss");
		TimeZone tz1=TimeZone.getTimeZone("IST");
		sdf1.setTimeZone(tz1);
		date1 = sdf1.parse(time1);
		//sdf.format(date);
		
		//System.out.println("Input Zone id: "+ tp.getInputZoneId());
		System.out.println("Time in "+tp.getInputZoneId()+" is: "+sdf1.format(date1));
		
		sdf2=new SimpleDateFormat("hh:mm:ss");
		TimeZone tz2=TimeZone.getTimeZone("CST");
		sdf2.setTimeZone(tz2);
date2=sdf2.parse(time1);

System.out.println("Time in "+tp.getInputZoneId()+" is: "+sdf2.format(date2));
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
}


