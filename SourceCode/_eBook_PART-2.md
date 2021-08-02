# PART 2 [초급] 오늘부터 나는 Java 프로그래머!

## 14 자바 프로그래밍 실행하기
```java
public class Hello {
	public static void main(String[] args) {
		System.out.println("**********************************************");
		System.out.println("이 프로그래밍은 Java200이 만들었습니다.*");
		System.out.println("**********************************************");
	}
}
```

## 15 기본 타입 선언하기
```java
public class JavaPrimaryType {
	public static void main(String[] args) {
		boolean isL=false;
		char suit='H';
		int year=2016;
		double latitude=37.52127220511242;
		double longitude=127.0074462890625;
		System.out.println(latitude+"\t"+longitude);
	}
}
```

## 16 API에서 제공하는 참조 타입 사용하기
```java
import java.util.Calendar;        // Calendar는 java.util에 있다.
import java.util.Date;            // Date는 java.util에 있다.
// 참조 타입
public class JavaObjectType {
	public static void main(String[] args) {
		// 기본 타입의 배열은 참조 타입
		int [] m={1,2,3};            // 배열
		int [] n=new int[] {1,2,3} ; // 배열
		// 참조 타입 - 객체 타입
		String card="H8";            // 문자열
		Date d=new Date();           // 오늘
		Calendar cal=Calendar.getInstance();  //오늘
		//자동으로 toString()이 붙음
		System.out.println(card);    // card.toString()
		System.out.println(d);       // d.toString()
		System.out.println(cal);     // cal.toString()
	}
}
```

## 17 사용자 정의 참조 타입 사용하기
```java
//사용자 정의 클래스 
class JLocation{
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {
	public static void main(String[] args) {
		//두 개의 기본 타입
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
```

## 18 문자열을 실수로 변환하기
```java
// 타입 변환의 필요성
public class JavaTypeCoversion {
	public static void main(String[] args) {
		String slat=" 37.52127220511242     ";
		//String slat="hello";
		//공백 제거 후 double로 타입 변환
		double latitude=Double.parseDouble(slat.trim()); 
		System.out.println(latitude);
	}
}
```

## 19 코멘트(주석) 달기
```java
// 코멘트 - 프로그래밍에는 영향이 없고 설명을 위한 표시
public class JavaComment {
	public static void main(String[] args) {
		/*
		0.0<= 실수값 <10.0을 (int)하면 정수만 반환한다. 
		그래서 0~9 사이의 임의 정수를 반환한다.
		*/
		int makeOne=(int)(Math.random()*10);   
		// 0~9 사이의 임의 정수
		System.out.println(makeOne);
	}
}
```

## 20 정수 연산하기
```java
// 정수 변수, 연산
public class Grad {
	public static void main(String[] args) {
		int kor=90;
		int eng=80;
		int math=89;
		int tot=kor+eng+math;
		int average=tot/3;              // 정수 연산은 정수
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t",kor,eng,math);
		System.out.printf("총점 %d점, 평균 %d점\n",tot,average);
	}
}
```

## 21 정수 타입의 배열 사용하기
```java
// 정수 배열
public class Grad {
	public static void main(String[] args) {
		int [] grade={90, 80, 89};
		int tot=grade[0]+grade[1]+grade[2];
		int average=tot/3;              // 정수 연산은 정수
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t",
				grade[0],grade[1],grade[2]);
		System.out.printf("총점 %d점, 평균 %d점\n",tot,average);
	}
}
```

## 22 실수 타입의 변수 사용하기
```java
// 실수 변수 ,연산
public class HighHill {
	public static void main(String[] args) {
		double S=6;      // 6 영국 신발 사이즈-> 255mm
		double P=0.75;   // 75% 히트할 확률
		double L=200;    // 200파운드-> 1,787원/1파운드
		double T=0;      // 0년(올해 유행) 1년 전 유행
		double A=1;      // 음주량  0잔->8.83cm  1잔->4.42cm
		double Y=2;      // 착용년도
		double ups1=P*L*(Y+9);
		double downs=(T+1)*(A+1)*(Y+10)*(L+20);
		double ups2=12+3*S/8.0;                 
		double high = ups1  /  downs * ups2;    //밝혀낸 식
		System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.",high);    
	}
}
```

## 23 문자와 문자열의 관계 살펴보기
```java
// char, escape
public class Letters {
	public static void main(String[] args) {
        char a='닳';
		String letter="동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int letterNumber=letter.length();     
		int loc=letter.indexOf(a);
		System.out.printf("\"%s\"=> %d자이며, '%c'은 %d번째 있다.\n",
				letter,letterNumber,a,loc);
		char b=letter.charAt(loc) ;   
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'다.",letter,loc,b );
	}
}
```

## 24 메서드 선언하고 호출하기
```java
// 메서드
public class Hello {
	// 메서드 선언
	public static void showHello() {
		System.out.println("**********************************************");
		System.out.println("*        이 프로그래밍은 Java200이 만들었습니다.      *");
		System.out.println("**********************************************");
	}
	//메서드 호출
	public static void main(String[] args) {
		showHello();        // '메서드 이름()'
	}
}
```

## 25 키보드로 입력받아 콘솔에 출력하기
```java
import java.util.Scanner;
// 입력, 출력
public class InOutMethod {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in); //키보드
		
		System.out.println("정수를 입력하세요.");
		int choice=scann.nextInt();     //키보드로 정수 입력
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice=scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice=scann.next();
		System.out.println(schoice);
	}
}
```

## 26 상수 사용하기
```java
// 상수
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		System.out.println(PHYSICAL);   
		int index=PHYSICAL;                  // 상수값을 변수에 대입 
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals=2 * Math.PI / index ;
		System.out.println(vals +"라디안");
	}
}
```

## 27 연산자를 이용하여 바이오리듬 값 구하기
```java
// 연산  % * /
public class BioCalendar {
	public static final int PHYSICAL = 23;     // 상수(개발자 정의), 상수값은 변경 불가
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days=1200;   
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals=(days % index) * 2 * Math.PI / index ;
		System.out.println( Math.toDegrees(vals) +"도");
	}
}
```

## 참고
[초보자를 위한 Java 200제, 2판](http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788956747859&orderClick=LEa&Kc=)