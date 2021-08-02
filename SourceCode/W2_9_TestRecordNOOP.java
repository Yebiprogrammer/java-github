public class W2_9_TestRecordNOOP{
	public static void main(String[] args){
		String[] name = {
			"홍길동", "김영희", "박철수"
		};
		int[][] info = {
			{2, 15, 1},
			{2, 15, 2},
			{2, 15, 3}
		};
		int[] koreanScore = {90, 80, 75};
		int[] mathScore = {79, 85, 73};
		int[] englishScore = {98, 67, 84};
		int[] historyScore = {89, 62, 81};

		for(int i=0; i<name.length; i++){
			// 학생정보 출력
			// 이름
			System.out.print("이름:" + name[i] + ", ");
			// 학년, 반, 번호
			System.out.print(
				"학년:" + info[i][0] + ", 반:" + info[i][1] + ", 번호:" + info[i][2] + " "
			);
			int totalScore = koreanScore[i] + mathScore[i] + englishScore[i] + historyScore[i];
			double averageScore = totalScore / 4.0;

			System.out.print(
				"총점:" + totalScore + ", 평균:" + averageScore
			);
			System.out.println("");
		}
		int totalFinalScore = 0;
		for(int i=0; i<name.length; i++){
			totalFinalScore += koreanScore[i];
			totalFinalScore += mathScore[i];
			totalFinalScore += englishScore[i];
			totalFinalScore += historyScore[i];
		}
		double totalFinalAverage = totalFinalScore / 12.0;
		System.out.println("전체 평균:" + totalFinalAverage);
	}
}