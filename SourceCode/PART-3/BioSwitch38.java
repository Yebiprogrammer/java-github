// enum, switch case
public class BioSwitch {
	// 메서드 선언
	public static String textInfor(PEI index, double value) {
		String result = "";
		switch( index ) {
			case PHYSICAL : result = "신체지수: " ;break;
			case EMOTIONAL : result = "감정지수: "; break;
			case INTELLECTUAL : result = "지성지수: "; break;
			default : result = "미결정: "; break;
		}
		return result + (value*100);
	}
	public static void main(String[] args) {
		PEI index=PEI.PHYSICAL;
		double value=0.86;
		System.out.println("신체지수 주기값: "+index.getPei());  //enum을 int로 변환 
		String st=textInfor( index,  value) ;
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
	
}