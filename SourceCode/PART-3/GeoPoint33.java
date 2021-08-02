// 위도, 경도를 한 묶음으로 객체에 저장
public class GeoPoint {
	public static void main(String[] args) {
		// 실수 변수
		double latitude1=37.52127220511242;
		double longitude1=127.0074462890625;   // 서울
		double latitude2=35.137879119634185;
		double longitude2=129.04541015625;     // 부산
		// (위도, 경도) 객체
		Geo geo1=new Geo();
		geo1.latitude=latitude1;
		geo1.longitude=longitude1;
		System.out.println(geo1.latitude+"\t"+geo1.longitude );
		
		Geo geo2=new Geo();
		geo2.latitude=latitude2;
		geo2.longitude=longitude2;
		// 객체 전달
		Geo geo=geo1;
		System.out.println(geo.latitude+"\t"+geo.longitude );
	}
}
