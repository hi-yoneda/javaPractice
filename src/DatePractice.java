import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

//コンソールに「3年後の今日が何曜日なのか」を計算して表示する。LocalDateTimeとDayOfWeekは必ず使う。

class DatePractice {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年");

		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = f.parse("2020/09/10 01:23:45");
		System.out.println(date);
		Date nowTime = new Date();
		String s = f.format(nowTime);
		System.out.println(s);

		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,6,0,0);
		System.out.println(l1);
		System.out.println(l2);
		LocalDateTime threeYearsLater = l1.plusYears(3);
		System.out.println(threeYearsLater);
		DayOfWeek Day = threeYearsLater.getDayOfWeek();
		System.out.println(Day);


	}

}
