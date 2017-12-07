package Parkhaus;

import java.util.Calendar;
import java.util.Date;


public class Tiket implements Tiketif{
	
	int gebuhr =0;
	Calendar cal = Calendar.getInstance();
	Date d1 = cal.getTime();
	private int stundeEin=0;
	private int minuteEin=0;
	private int stundeAus=0;
	private int minuteAus=0;
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void setEinfahrt(int stundeEin, int minuteEin) {
		this.stundeEin= stundeEin;
		this.minuteEin= minuteEin;
		stundeEin = d1.getHours();
		minuteEin = d1.getMinutes();
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setAusfahrt(int stundeAus, int minuteAus) {
		this.stundeAus= stundeAus;
		this.minuteAus= minuteAus;
		stundeAus = d1.getHours();
		minuteAus= d1.getMinutes();
		
	}

	@Override
	public int getGebuehren(int gebuehr) {
		int stunde = stundeAus-stundeEin;
		int minute = minuteAus-minuteEin;
		if(minute!=0 && minute>0){
			stunde = stunde+1;
		}
		this.gebuhr= gebuehr;
		gebuehr = stunde* gebuehr;
		return gebuehr;
	}

}
