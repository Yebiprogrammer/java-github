public class W2_7_GugudanOOP {
	public static void main(String[] args) {
		System.out.println("구구단(객체지향 방법)");
		
		// 객체 생성(인스턴스 생성)
		Gugudan gg = new Gugudan();
		gg.run();
	}
}

// 구구단 클래스 설계도
class Gugudan {
	public void run(){
		for(int i=1; i<=9; i++){
			System.out.println("#######"+ i + "단#######");
			this.gugudan(i);
		}
	}
	public void gugudan(int dan){
		for(int j=1; j<=9; j++) {
			System.out.println(" " + dan + " X " + j + " = " + dan*j);
		}
	}
}