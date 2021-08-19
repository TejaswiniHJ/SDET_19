package com.generic;

import java.util.Date;
import java.util.Random;


/**
 * @author Tejaswini HJ
 * This class contains methods below
 * Date, Time,Year, Day, random numbers creation
 */

public class Java_Utilities
{
	
	
	/**
	 * @author Tejaswini HJ
	 * This method is use craete random numbers
	 * @return random numbers upto 100
	 */
	
	public int random()
	{
		Random ran=new Random();
		int r = ran.nextInt(100);
		
		return r;
	}
	
	
	
	/**
	 * @author Tejaswini HJ
	 * This method is use to do get the date 
	 * @return date
	 */
		
public String Forday()
{
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();

	String[] arr = currentdate.split(" ");

	String day = arr[0];
	return day;
}




/**
 * @author Tejaswini HJ
 * This method is use to do get the Month 
 * @return Month
 */

public String ForMonth()
{
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();

	String[] arr = currentdate.split(" ");

	String month = arr[1];
	return month;
}




/**
 * @author Tejaswini HJ
 * This method is use to do get the Date 
 * @return Date
 */

public String ForDate()
{
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();

	String[] arr = currentdate.split(" ");

	String Date = arr[2];
	return Date;
}




/**
 * @author Tejaswini HJ
 * This method is use to do get the Time 
 * @return Time
 */

public String ForTime()
{
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();

	String[] arr = currentdate.split(" ");

	String Time = arr[3];
	return Time;
}



/**
 * @author Tejaswini HJ
 * This method is use to do get the Year 
 * @return Year
 */

public String ForYear()
{
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();

	String[] arr = currentdate.split(" ");

	String Year = arr[5];
	return Year;
}
}