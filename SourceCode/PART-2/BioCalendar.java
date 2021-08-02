// 상수
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		System.out.println(PHYSICAL);   
		int index=PHYSICAL;                  // 상수값을 변수에 대입 
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals=2 * Math.PI / index ;
		System.out.println(vals +"라디안");
	}
}