import java.util.Calendar;
import java.util.Date;
// 내가 태어나서 오늘까지 몇일이 지났을까? (객체지향 방법)
public class W2_8_MyD_DayOOP {
	public static void main(String[] args) {
		// 인스턴스(객체) 생성
		DDay[] bts = new DDay[7]; // 방탄소년단
		DDay[] blackpink = new DDay[4]; // 블랙핑크
		DDay[] seotaeji = new DDay[3]; // 서태지와 아이들

		// 객체 생성시 생성자를 호출하는 방법
		// 방탄소년단
		bts[0] = new DDay("진", 1992, 12, 4);
		bts[1] = new DDay("슈가", 1993, 3, 9);
		bts[2] = new DDay("제이홉", 1994, 2, 18);
		bts[3] = new DDay("RM", 1994, 9, 12);
		bts[4] = new DDay("지민", 1995, 10, 13);
		bts[5] = new DDay("뷔", 1995, 12, 30);
		bts[6] = new DDay("정국", 1997, 9, 1);
		// 블랙핑크
		blackpink[0] = new DDay("지수", 1995, 1, 3);
		blackpink[1] = new DDay("제니", 1996, 1, 16);
		blackpink[2] = new DDay("로제", 1997, 2, 11);
		blackpink[3] = new DDay("리사", 1997, 3, 27);
		// 서태지와 아이들
		seotaeji[0] = new DDay("서태지", 1972, 2, 21);
		seotaeji[1] = new DDay("이주노", 1967, 2, 10);
		seotaeji[2] = new DDay("양현석", 1969, 12, 2);

		System.out.println("[ 방탄소년단 ]");
		bts[0].show();
		bts[1].show();
		bts[2].show();
		bts[3].show();
		bts[4].show();
		bts[5].show();
		bts[6].show();
		System.out.println("[ 블랙핑크 ]");
		blackpink[0].show();
		blackpink[1].show();
		blackpink[2].show();
		blackpink[3].show();
		System.out.println("[ 서태지와 아이들 ]");
		seotaeji[0].show();
		seotaeji[1].show();
		seotaeji[2].show();
	}
}

class DDay {
	String name = null;
	public DDay(String name, int y, int m, int d) {
		this.setName(name);
		this.setMyBirth(y, m, d);
	}
	Calendar myBirth = Calendar.getInstance();
	public void setName(String name){
		this.name = name;
	}
	public void setMyBirth(int y, int m, int d){
		this.myBirth.set(y, m-1, d);
	}
	public int getMyDDay(){
		Calendar today = Calendar.getInstance();  // 오늘 날짜를 객체로 가져오는 방법
		long dday_millis = today.getTimeInMillis() - myBirth.getTimeInMillis();
		dday_millis = dday_millis / 1000 / 24 / 60 / 60;
		return Long.valueOf(dday_millis).intValue();
	}
	public String getName(){
		return this.name;
	}
	public void show(){
		System.out.println(
			"'" + this.getName() + "'의 D-Day To Birth는 " + this.getMyDDay() + "일 입니다."
		);
	}
}