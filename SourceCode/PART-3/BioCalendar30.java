// non static 메서드(멤버)
public class BioCalendar30 {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // static 변수 생성없이 사용
	// 멤버 메서드(non static)메서드 선언
	public  double getBioRhythm(long days, int index ,int max) {
		return max*Math.sin( (days % index) * 2 * Math.PI / index );
	}
	public static void main(String[] args) {
		int days=1200;  
		BioCalendar bio=new BioCalendar();   //객체를 생성
		// 멤버 메서드 호출 
		double phyval=bio.getBioRhythm( days,  PHYSICAL,     100);
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}