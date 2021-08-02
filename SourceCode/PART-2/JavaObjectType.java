import java.util.Calendar;        // Calendar는 java.util에 있다.
import java.util.Date;            // Date는 java.util에 있다.
// 참조 타입
public class JavaObjectType {
	public static void main(String[] args) {
		// 기본 타입의 배열은 참조 타입
		int [] m={1,2,3};            // 배열
		int [] n=new int[] {1,2,3} ; // 배열
		// 참조 타입 - 객체 타입
		String card="H8";            // 문자열
		Date d=new Date();           // 오늘
		Calendar cal=Calendar.getInstance();  //오늘
		//자동으로 toString()이 붙음
		System.out.println(card);    // card.toString()
		System.out.println(d);       // d.toString()
		System.out.println(cal);     // cal.toString()
	}
}
