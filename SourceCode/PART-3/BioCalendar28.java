// Math.sin(), s014.Math.toDegrees()
public class BioCalendar28 {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days=1200;     
		double phyval=100*Math.sin( (days % index) * 2 * Math.PI / index );
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}
