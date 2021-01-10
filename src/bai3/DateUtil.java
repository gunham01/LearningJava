package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String DATE_PATTERN = "dd/MM/yyyy";
	
	public static final Date stringToDate(String input) {
		try {
			return new SimpleDateFormat(DATE_PATTERN).parse(input);
		} catch (ParseException ex) {
			return null;
		}
	}
	
	public static final String dateToString(Date date) {
		return new SimpleDateFormat(DATE_PATTERN).format(date);
	}
}
