public class W2_9_TestRecordOOP {
	public static void main(String[] args){
		// 객체 인스턴스 만들기
		Test[] test = new Test[3];
		test[0] = new Test(
			"홍길동", 2, 15, 1, 90, 79, 98, 89
		);
		test[1] = new Test(
			"김영희", 2, 15, 2, 80, 85, 67, 62
		);
		test[2] = new Test(
			"박철수", 2, 15, 3, 75, 73, 84, 81
		);
		
		// 출력하기 
		test[0].show();
		test[1].show();
		test[2].show();

		// 전체평균 구하기
		int testTotal = 0;
		for(int i=0; i<test.length;i++){
			testTotal += test[i].koreaScore;
			testTotal += test[i].mathScore;
			testTotal += test[i].englishScore;
			testTotal += test[i].historyScore;
		}
		double testAverage = testTotal / 12.0;
		System.out.println(
			"전체평균:" + testAverage
		);
	}	
}

// 객체 설계도
class Test{
	String name = null;
	int hak = 0, ban = 0, bunho = 0;
	int koreaScore = 0, mathScore = 0, englishScore = 0, historyScore = 0;
	public Test(String n, int h, int bn, int bh,
	int kScore, int mScore, int eScore, int hScore){
		this.name = n;
		this.hak = h;
		this.ban = bn;
		this.bunho = bh;
		this.koreaScore = kScore;
		this.mathScore = mScore;
		this.englishScore = eScore;
		this.historyScore = hScore;
	}
	public int getTotalScore(){
		return this.koreaScore + this.mathScore + this.englishScore + this.historyScore;
	}
	public double getAverageScore(){
		return getTotalScore() / 4.0;
	}
	public void show(){
		System.out.println(
			"이름:"+ this.name + ", " +
			"학년:"+ this.hak + ", "+
			"반:"+ this.ban + ", "+
			"번호:"+ this.bunho + ", "+
			"국어점수:"+ this.koreaScore + ", "+
			"수학점수:"+ this.mathScore + ", "+
			"영어점수:"+ this.englishScore + ", "+
			"한국사점수:"+ this.historyScore + ", "+
			"평균:" + getAverageScore()
		);
	}
}