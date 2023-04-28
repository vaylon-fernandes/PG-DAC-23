package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import custom_exceptions.InvalidLicenseException;
import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static SimpleDateFormat sdf;
	
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
		sdf=new SimpleDateFormat("dd-MM-yyy"); // Initialize sdf as static to avoid creating multiple instances in memory
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed<MIN_SPEED) {
			throw new SpeedOutOfRangeException("Speed up!!!You are going too slow!!!");
		}
		if(speed>MAX_SPEED) {
			throw new SpeedOutOfRangeException("Slow Down!!! You're going too fast!!!! ");
		}
	}
	
	public static Date validateLicenseDate(String expiryDate) throws ParseException {
		Date today = new Date();
		Date licenseExp = sdf.parse(expiryDate);
		if(licenseExp.after(today)) {
			return licenseExp;
		}
		throw new InvalidLicenseException("Your license has expired!!! Please renew!!!");
	}

}
