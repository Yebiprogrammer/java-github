//사용자 정의 클래스 
class JLocation{
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {
	public static void main(String[] args) {
		//두 개의 기본 타입
		int number = 0;
		double latitude=37.52127220511242;
		double longitude=127.0074462890625;
		//사용자 정의 객체를 생성 
		JLocation jloc=new JLocation();
		jloc.lat=latitude;      // 값을 대입
		jloc.lng=longitude;     // 값을 대입
		
		JLocation newLoc=jloc;  // 객체를 대입
		System.out.println(newLoc.lat);  // 출력
	}
}
