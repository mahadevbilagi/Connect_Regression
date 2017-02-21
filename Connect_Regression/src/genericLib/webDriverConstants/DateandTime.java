package genericLib.webDriverConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import base.ConnectBaseSetup;

public class DateandTime extends ConnectBaseSetup {	
	
	public Date currentDate() throws ParseException
	{
			// Current Date without time
				Date today = new Date();
			    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			    today = sdf1.parse(sdf1.format(today));
			    System.out.println("Current Date : " + today);
			    return today;
	}
	
	public int currentHour()
	{
		System.out.println("Hour :" + new Date().getHours());
		return new Date().getHours();
	}
	
	public int currentMinutes()
	{
		System.out.println("Min :" + new Date().getMinutes());
		return new Date().getMinutes();
	}
	
	public void currentAMPMType(String AM, String PM)
	{
		int AMPMtype = new Date().getHours();
		String type,type1;
		if(AMPMtype <= 12){
			type = AM;
			System.out.println("AM PM Type :" + AMPMtype);
			return;
		}else
		{
			type1 = PM;
			System.out.println("AM PM Type :" + type1);
			return;
		}
			
	}
	

}
