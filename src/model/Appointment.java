package model;

import java.awt.Color;
import java.sql.Date;
import java.sql.Time;

public class Appointment{
	
    private int appointmentID;
	private String appointmentName;
    private String color;
    private Date appointmentDate;
    private Time timeIn;
    private Time timeOut;
    private int clientID;
    private int doctorID;
    private boolean status;
    
    public final static String TABLE_NAME = "appointment";
	public final static String COL_ID = "appointmentID";
	public final static String COL_APPOINTMENTNAME = "appointment_name";
	public final static String COL_DATE = "date";
	public final static String COL_TIMESTART = "time_start";
	public final static String COL_TIMEEND = "time_end";
	public final static String COL_CLIENTID = "clientID";
	public final static String COL_DOCTORID = "doctorID";
	public final static String COL_STATUS = "status";

    public Color getColor() {
        switch (color.toUpperCase()) {
            case "GREEN":
                return Color.GREEN;
            case "RED":
                return Color.RED;
            case "BLUE":
                return Color.BLUE;
            default:
                return Color.ORANGE;
        }
    }
    
    public void setColor(String color){
    	this.color = color;
    }
    
    public String getColorName(){
    	return color.toUpperCase();
    }
    
//    public boolean checkYearMonth(int year, int month) {
//        return this.getYear() == year && this.getMonth() == month;
//    }
//
//    public boolean checkSameDate(int year, int month, int day) {
//        return this.getYear() == year && this.getMonth() == month && this.getDay() == day;
//    }
//
//	public String toString(){
//		String a = month + "/" + day + "/" + year + " "+ event + " " + shour + ":" + sminute + " - " + ehour + ":" + eminute;
//		return a;
//	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAppointmentName() {
		return appointmentName;
	}

	public void setAppointmentName(String appointmentName) {
		this.appointmentName = appointmentName;
	}

	public Time getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Time timeIn) {
		this.timeIn = timeIn;
	}

	public Time getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Time timeOut) {
		this.timeOut = timeOut;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
   
}
