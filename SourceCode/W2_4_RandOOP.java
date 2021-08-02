import java.util.Random;
public class W2_4_RandOOP {
	public static void main(String arg[]){
		System.out.println("랜덤 1");
		RandAlgo rnd1 = new RandAlgo();
		rnd1.initInput();
		System.out.println(
			"최대값은 " + rnd1.getMax() + ", "
			+ "최소값은" + rnd1.getMin() + "입니다."
		);
		System.out.println(
			"평균값은 " + rnd1.getAverage() + "입니다."
		);

		System.out.println("랜덤 2");
		RandAlgo rnd2 = new RandAlgo();
		rnd2.initInput();
		System.out.println(
			"최대값은 " + rnd2.getMax() + ", "
			+ "최소값은" + rnd2.getMin() + "입니다."
		);
		System.out.println(
			"평균값은 " + rnd2.getAverage() + "입니다."
		);

	}
}

// 객체지향 설계하기
class RandAlgo {
	public int nInput = 100;
	public int maxRandom = 1000;
	int[] input = new int[nInput];
	// 값 초기화 하기
	public void initInput(){
		Random rnd = new Random();
		for(int i=0; i<nInput; i++){
			input[i] = rnd.nextInt(maxRandom)+1;
			System.out.print(input[i] + " ");
		}
		System.out.println("");
	}

	// 최대값 구하기
	public int getMax(){
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<nInput; i++){
			if(input[i] > maxValue){
				maxValue = input[i];
			}
		}
		return maxValue;
	}

	// 최소값 구하기
	public int getMin(){
		int minValue = Integer.MAX_VALUE;
		for(int i=0; i<nInput; i++){
			if(input[i] < minValue){
				minValue = input[i];
			}
		}
		return minValue;
	}

	// 평균 구하기
	public double getAverage(){
		double avg = 0;
		int total = 0;
		for(int i=0; i<nInput; i++){
			total += input[i];  // total = total + input[i]
		}
		avg = total / nInput; // 평균 구하기
		return avg;
	}
}






