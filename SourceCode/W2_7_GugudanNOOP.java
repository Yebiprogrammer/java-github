public class W2_7_GugudanNOOP {
	public static void main(String[] args) {
		System.out.println("구구단 (절차지향 방법)");
		for(int i=1; i<=9; i++) {
			System.out.println("#######"+ i + "단#######");
			for(int j=1; j<=9; j++) {
				System.out.println(" " + i + " X " + j + " = " + i*j);
			}
		}
	}	
}
