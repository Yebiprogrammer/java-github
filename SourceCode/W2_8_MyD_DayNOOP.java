import java.util.Calendar;
import java.util.Date;
// 내가 태어나서 오늘까지 몇일이 지났을까?
public class W2_8_MyD_DayNOOP {
	public static void main(String[] args) {
		//long millis = System.currentTimeMillis();  // 1970년 1월 1일부터 시간 msec
		//System.out.println("1970년 1월 1일부터 " + millis/1000/24/60/60 + "일 지났습니다."); // 몇일 지났는지 계산하기
	
		//Date d = new Date();  // 오늘 날짜를 가져오는 방법
		//System.out.println(d);
		//Date dd = new Date(d.getTime() + 24*60*60*1000);  // 오늘 날짜에서 하루를 더하는 방법
		//System.out.println(dd);

		Calendar today = Calendar.getInstance();  // 오늘 날짜를 객체로 가져오는 방법
		Calendar myBirth = Calendar.getInstance();  // 날짜를 임의롤 지정하는 방법
		myBirth.set(1994, 9-1, 12); // BTS 리더 RM 생일 (1994년 9월 12일)

		//System.out.println(today);
		long dday_millis = today.getTimeInMillis() - myBirth.getTimeInMillis();
		printCalendar(myBirth);
		System.out.print(" 부터 ");
		printCalendar(today);
		System.out.print(" 까지 ");
		System.out.print(
			dday_millis / 1000 / 24 / 60 / 60
		);
		System.out.print(" 일 차이가 납니다");
		System.out.println("");
	}
	public static void printCalendar(Calendar c) {
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print(c.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "일");
	}
}