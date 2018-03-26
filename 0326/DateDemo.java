import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo{
	public static void main(String[] args){
		Date date = new Date();
		String strDateFormat = "YYYY-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}
}
