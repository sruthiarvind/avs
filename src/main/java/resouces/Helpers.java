package resouces;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helpers extends Pages {

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
