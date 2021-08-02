// 1차원 배열, 2차원 배열
public class GeoPoint {
	public static void main(String[] args) {
		// 실수변수
		double latitude1=37.52127220511242;
		double longitude1=127.0074462890625;   // 서울
		double latitude2=35.137879119634185;
		double longitude2=129.04541015625;     // 부산
		System.out.println(latitude1+"\t"+longitude1 );
		// 실수 1차원 배열
		double [] latlng1={latitude1,longitude1};
		double [] latlng2={latitude2,longitude2};
		System.out.println( latlng1[0]+"\t"+latlng1[1] );
		// 실수 2차원 배열
		double [][] latlng={ {latitude1,longitude1},
				             {latitude2,longitude2} };
		System.out.println( latlng[0][0]+"\t"+latlng[0][1] );
	}
}