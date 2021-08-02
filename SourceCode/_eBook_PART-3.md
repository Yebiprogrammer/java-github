# PART 3 [중급] Java 프로그래밍 기초 다지기

## 28 Math 클래스를 사용하여 신체 지수 구하기
```java
// Math.sin(), s014.Math.toDegrees()
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days=1200;     
		double phyval=100*Math.sin( (days % index) * 2 * Math.PI / index );
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}
```

## 29 static 메서드로 신체 지수 구하기
```java
// static 메서드
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	// static 메서드 선언
	public static double getBioRhythm(long days, int index ,int max) {
		return max*Math.sin( (days % index) * 2 * Math.PI / index );
	}
	public static void main(String[] args) {
		int days=1200;     
		// 메서드 호출 
		double phyval=getBioRhythm( days,  PHYSICAL,     100);
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}
```

## 30 멤버 메서드를 이용하여 신체 지수 구하기
```java
// non static 메서드(멤버)
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // static 변수 생성없이 사용
	// 멤버 메서드(non static)메서드 선언
	public  double getBioRhythm(long days, int index ,int max) {
		return max*Math.sin( (days % index) * 2 * Math.PI / index );
	}
	public static void main(String[] args) {
		int days=1200;  
		BioCalendar bio=new BioCalendar();   //객체를 생성
		// 멤버 메서드 호출 
		double phyval=bio.getBioRhythm( days,  PHYSICAL,     100);
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}
```

## 31 상수의 묶음 클래스 enum 사용하기
```java
// 상수의 묶음
public class FruitMain {
	public static void main(String[] args) {
		FRUIT pear=FRUIT.APPLE;
		FRUIT pear2=FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());  // 선언될 때 순서 0
		System.out.println(pear2.ordinal()); // 선언될 때 순서 2
		FRUIT [] fruits=FRUIT.values();
		System.out.println(fruits[0]);
	}
}
public enum FRUIT{
	APPLE, BANANA, MANGO
}
```

## 32 1, 2차원 배열로 위도, 경도 표현하기
```java
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
```

## 33 객체를 이용하여 위도, 경도 표현하기
```java
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
// 위도,경도를 저장하는 클래스
public class Geo {
	public double latitude;      
	public double longitude;   
}
```

## 34 if 조건문을 이용하여 짝·홀수 판별하기
```java
// if condition
public class EvenOddIfCondition {
	public static void main(String[] args) {
		int temp=99;
		if(temp%2==1){    // 홀수 
			temp=temp*3+1;
		}else{
			temp=temp/2;
		}
		System.out.printf("계산 후=%d\n",temp);
	}
}
```

## 35 삼항연산자를 이용하여 짝·홀수 판별하기
```java
// 삼항(?:)연산자 
public class EvenOddTriCondition {
	public static void main(String[] args) {
		int temp=99;
		temp = (temp%2==1) ? temp*3+1 : temp/2;
		System.out.printf("계산 후=%d\n",temp);
	}
}
```

## 36 입력받은 정수값에 따라 신체, 감정, 지성값 출력하기
```java
// case
public class BioSwitch {
	// 조건에 따라 신체, 감정, 지성값을 출력
	public static String textInfor(int index, double value) {
		String result = "";
		switch( index ) {
			case 23 : result = "신체지수: " ;break;
			case 28 : result = "감정지수: "; break;
			case 33 : result = "지성지수: "; break;
		}
		return result + (value*100);
	}
	public static void main(String[] args) {
		int index=23;          // 신체지수
		double value=0.86;
		String st=textInfor( index,  value) ;  //메서드 호출
		System.out.println(st);
	}
}
```

## 37 상수값에 따라 신체, 감정, 지성값 출력하기
```java
// 상수, switch case
public class BioSwitch {
	// 상수 
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	// 메서드 선언 
	public static String textInfor(int index, double value) {
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
		int index=PHYSICAL;
		double value=0.86;
		String st=textInfor( index,  value) ;
		System.out.println(st);
	}
}
```

## 38 enum 값에 따라 신체, 감정, 지성값 출력하기
```java
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
// 상수 묶음 클래스- enum
public enum PEI{
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;
	PEI(int pie){
		this.peiValue=pie;
	}
	public int getPei(){
		return peiValue;
	}
}
enum FRUIT{
	APPLE, BANANA, MANGO
}
```

## 39 switch~case로 카드값 구하기
```java
// char switch
public class SwitchCondition {
	public static int toNum(char c){
		int tot=0;
		switch(c){
			case 'A': tot=1;break;
			case 'T': tot=10;break;
			case 'J': tot=11;break;
			case 'Q': tot=12;break;
			case 'K': tot=13;break;
			default : tot=c-'0'; break; //'9'-'0'
		}
		return tot;
	}
	public static void main(String[] args) {
		char c='J';
		int result=toNum(c);
		System.out.printf("%c=>%d\n",c,result);		
	}
}
```

## 40 switch~case로 환율 구하기
```java
// String switch
public class SwitchStringCondition {
	public static double toMoney(String c){
		double tot=0.0;
		switch(c){
			case "USD": tot=1126.5;break;
			case "JPY": tot=110.6;break;
			case "CNY": tot=10.5;break;
			default : tot=1; break; 
		}
		return tot;
	}
	public static void main(String[] args) {
		String money="USD";
		double result=toMoney(money);
		System.out.printf("%s => %f\n",money,result);		
	}
}
```

## 41 논리 연산자(&&, ||)로 윤년 판별하기
```java
// if && || 
public class JCalendar {
	public boolean isLeapYear(int year){
		boolean isS=false;
		if( ((year%4==0)&&(year%100!=0)) || (year%400==0)){
			isS=true;
		}
		return isS;
	}
	public static void main(String[] args) {
		JCalendar hc=new JCalendar();
		System.out.println( hc.isLeapYear(2017));
	}
}
```

## 42 정수-실수 변환으로 섭씨를 화씨로 바꾸기
```java
// 반복문
public class Temperature {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			double fahrenheit=9.0/5*i+32;    //for 블록 변수
			System.out.printf("섭씨 %d도= 화씨 %.2f도.\n",i,fahrenheit);
		}
	}
}
```

## 43 while을 이용하여 1이 될 때까지 나누고 곱하기
```java
// while
public class EvenOdd {
	public static void showOddnEvenw(int n){
		int temp=n;
		while(temp!=1){
			if(temp%2==1){       // 홀수 
				temp=temp*3+1;
			}else{               // 짝수 
				temp/=2;
			}
			System.out.print("["+temp+"] ");
		}
		System.out.println("\n---------------------");
	}
	public static void main(String[] args) {
		showOddnEvenw(122);
	}
}
```

## 44 do~while을 이용하여 1이 될 때까지 나누고 곱하기
```java
// do~while
public class EvenOdd {
	public static void showOddnEven(int n){
		int temp=n;
		do{
			if(temp%2==1){
				temp=temp*3+1;     // 홀수
			}else{
				temp/=2;           // 짝수
			}
			System.out.print("["+temp+"] ");
		}while(temp!=1);
		System.out.println("\n---------------------");
	}
	public static void main(String[] args) {
		showOddnEven(122);
	}
}
```

## 45 for를 이용하여 1이 될 때까지 나누고 곱하기
```java
// while로 사용하는 for
public class EvenOdd {
	public static void showOddnEvenf(int n){
		int temp=n;
		for( ; temp!=1 ; ){
			if(temp%2==1){           // 홀수 
				temp=temp*3+1;       
			}else{                   // 짝수
				temp/=2;
			}
			System.out.print("["+temp+"] ");
		}
		System.out.println("\n---------------------");
	}
	public static void main(String[] args) {
		showOddnEvenf(122);
	}
}
```

## 46 while을 이용하여 서로 다른 세 정수 만들기
```java
// break
public class BioRandom {
	public static void main(String[] args) {
		int range=10;
		int start=1;
		int a=0, b=0, c=0;
		while(true){
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
			if(a!=b && b!=c && c!=a) break;
		}
        System.out.printf("%d\t%d\t%d",a,b,c);
	}
}
```

## 47 while과 조건을 이용하여 서로 다른 세 정수 만들기
```java
// break
public class BioRandom2 {
	public static void main(String[] args) {
		int range=10;
		int start=1;
		int a=0, b=0, c=0;
		while(!(a!=b && b!=c && c!=a)){
			a=(int)(range*Math.random()+start);
			b=(int)(range*Math.random()+start);
			c=(int)(range*Math.random()+start);
		}
        System.out.printf("%d\t%d\t%d",a,b,c);
	}
}
```

## 48 while과 단축 연산자를 이용하여 각 자릿수의 합 구하기
```java
// 축약 연산자 
public class Contraction {
	public static int sumEach(int n){
		int tot=0;
		while(n!=0){
			tot+=n%10; // 3 -> 2-> 1
			n/=10;     // 123-> 12-> 1->0
		}
		return tot;
	}
	public static void main(String[] args) {
		int number=1234567;
		int value=sumEach(number);
		System.out.printf("%d에 대한 각자리의 수 합: %d",number,value);
	}
}

```

## 49 제곱근을 이용하여 소수 판별하기
```java
// Math 클래스 메서드 
public class PrimMath {
	public static boolean isPrime(int n){
		boolean isS=true;
		for (int i = 2; i <=(int)Math.sqrt(n); i++) {
			if(n%i==0){
				isS=false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[] args) {
		int number=1234567;
		boolean ifPrime=isPrime(number);   // 소수인가를 확인한다.
		if(ifPrime){
			System.out.printf("%는 1과 자신으로만 나눠떨어지는 소수다.",number);
		}else{
			System.out.printf("%d은 소수가 아니다.",number);
		}
	}
}
```

## 50 shift 연산자를 이용하여 2진수 문자열로 바꾸기
```java
// >> shift ? 삼항 연산자
public class BitNShiftMain {
	// 10진법 수를 2진수 스트링으로 변환
	public static String shifts(int a){
		String s="";
		for(int i=0;i<=31;i++){
			int aa=a%2;                
			s=(aa>=0)? aa+s : (-aa)+s;
			a>>=1;                     //  a/=2;
		}
		return s;
	}
	public static void main(String[] args) {
		int intNums1=123;
		int intNums2=-123;
		System.out.printf("%d  : %s%n",intNums1,shifts(intNums1));
		System.out.printf("%d : %s%n",intNums2,shifts(intNums2));
	}
}
```

## 51 &(비트) 연산자를 이용하여 2진수 문자열로 바꾸기
```java
// & 연산자 
public class BitNShiftMain {
	public static int BITMASK=1;
	// 10진법 수를 2진수 스트링으로 변환
	public static String shifts(int a){
		int BITMASK=1;
		String s="";
		for(int i=0;i<=31;i++){
			s=(a & BITMASK)+s;
			a>>=1;   //  a/=2;
		}
		return s;
	}
	public static void main(String[] args) {
		int intNums1=123;
		int intNums2=-123;
		System.out.printf("%d  : %s%n",intNums1,shifts(intNums1));
		System.out.printf("%d : %s%n",intNums2,shifts(intNums2));
	}
}
```

## 52 문자열 자르기를 이용하여 2진수 문자열로 바꾸기
```java
// String method
public class BitNShiftMain {
	public static int BITMASK=1;
	// 10진법 수를 2진수 스트링으로 변환
	public static String shifts(int a){
		int BITMASK=1;
		String s="";
		for(int i=0;i<=31;i++){
			s=(a & BITMASK)+s;
			a>>=1;   //  a/=2;
		}
		return s.substring(s.indexOf('1'));
	}
	public static void main(String[] args) {
		int intNums1=123;
		int intNums2=-123;
		System.out.printf("%d  : %s%n",intNums1,shifts(intNums1));
		System.out.printf("%d : %s%n",intNums2,shifts(intNums2));
	}

}
```

## 53 for와 if를 이용하여 홀수의 합 구하기
```java
// s=s+a 
public class ForCondition {
	public static void main(String[] args) {
		int s=0;
		for (int i = 1; i <= 100; i++) {
			s+=i;
		}
		System.out.println("1~100의 합: "+s);
		s=0;                 // 0으로 초기화
		for (int i = 1; i <= 100; i++) {
			if(i%2==1){
				s+=i;
			}
		}
		System.out.println("1~100사이의 홀수의 합: "+s);
	}
}
```

## 54 향상된 for(foreach)로 배열 출력하기
```java
// for와 배열
public class ForeachLotto {
	public static void main(String[] args) {
		int[]mm={1,6,16,22,23,33};
		for (int m : mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
	}
}
```

## 55 varargs(variable arguments)를 이용하여 배열 출력하기
```java
public class ForeachLotto {
	// var args variable arguments
	public static void print(int ... mm){
		for (int m : mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]mm={1,6,16,22,23,33};
		print(mm);             // 배열도 되고
		int a=1,b=6,c=16;      
		print(a);              // 1개 짜리도 되고
		print(a,b);            // 2개 짜리도 되고
		print(a,b,c);          // 3개 짜리도 되고
	}
}
```

## 56 배열보다 편리한 List 사용하기
```java
import java.util.ArrayList;
import java.util.List;
// 배열보다 변한 List
public class LottoList {
	public static void main(String[] args) {
		List<Integer> ilist=new ArrayList<>();
		// 넣기
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// 가져오기
		for(int i=0; i< ilist.size() ;i++){
			int m=ilist.get(i);
			System.out.printf("%d\t",m);
		}
		System.out.println();
	}
}
```

## 57 foreach와 Lambda 형식을 이용하여 List 출력하기
```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ForeachRambdaLotto {
	public static void main(String[] args) {
		List<Integer> mmlists=Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(
				m -> { System.out.printf(m+"\t"); } 
		);
		System.out.println();
		Consumer<Integer> consume = (Integer m) -> {System.out.printf(m+"\t");};
		mmlists.forEach(consume);
	}
}
```

## 58 for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
```java
import java.util.ArrayList;
import java.util.List;
// List
public class ForCondition2 {
	public static void main(String[] args) {
		List<Integer> ilist=new ArrayList<>();
		int s=0;
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		for(int m: ilist){
			if(m%2==1){
				s+= m*m;
				System.out.printf("%d\t", m*m);
			}
		}
		System.out.println();
		System.out.println("1~10사이의 홀수에 대한 제곱합: "+s);
	}
}
```

## 59 Stream을 이용하여 홀수의 합 구하기
```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
// stream
public class ForCondition3 {
	public static void main(String[] args) {
		List<Integer> ilist=new ArrayList<>();
		int s=0;
		for (int i = 1; i <= 100; i++) {
			ilist.add(i);
		}
		// 초기값 0, 
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합: "+s);
		s=0;  
		// 1~100사이의 홀수의 합
		s=ilist.stream().filter(i-> i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100사이의 홀수의 합: "+s);
		// 1~100사이의 홀수의 합
		s=ilist.stream().filter(i-> i%2==1).reduce(0, (x,y)->x+y );
		System.out.println("1~100사이의 홀수의 합: "+s);
		// 1~100사이의 홀수의 합
		s=ilist.stream().filter(i-> i%2==1).reduce(0, 
				                new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100사이의 홀수의 합: "+s);
	}
}
```

## 60 Stream과 map을 이용하여 홀수에 대한 제곱의 합 구하기
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// stream list filter map reduce
public class ForRambdaCondition {
	public static void main(String[] args) {
		List<Integer> ilist=new ArrayList<>();
		int s=0;
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// stream filter map collect
		ilist=ilist.stream()
				   .filter(i-> i%2==1)
				   .map(i -> i*i)
				   .collect(Collectors.toList());
		ilist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		//stream reduce 
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~10사이의 홀수에 대한 제곱합: "+s);
	}
}
```

## 61 String과 char를 이용하여 10진수를 2진수로 변환하기
```java
public class BitShifting {
	public static final int BITMASK=1;	
	public  String makeBit(int value){
		//char배열을 String으로 만들기 위해 
		char[] val=new char[32];
		for(int i=31;i>=0;i--){
			if((value & BITMASK) ==1){
				val[i]='1';    //  1&1 일 때만 1 그 외 0
			}else{
				val[i]='0';	   //  1&1 일 때만 1 그 외 0
			}
			value >>>=1;  //value=value>>>1; 부호 무시 오른쪽 이동
		}
		return new String(val);//char배열을 String으로
	}
	public static void main(String[] args) {
		int ival=2345;
		int eval=-2345;
		BitShifting bitsh=new  BitShifting();
		String vals=bitsh.makeBit(ival);
		System.out.println(vals);
		vals=bitsh.makeBit(eval);
		System.out.println(vals);
		char[] vs=vals.toCharArray();
		System.out.println(vs[0]);
	}
}
```

## 62 정수를 입력받을 때 발생할 수 있는 예외 처리하기
```java
public class  FormatTryCatch{
	public static void main(String[] args) {	
		String sNum="123";
		String nNum="h";
		try{
			int a=Integer.parseInt(sNum);
			System.out.println(a);
		}catch(NumberFormatException ee){
			System.out.println("int인지 확인해 봐!!!!");
			System.err.println(ee.getMessage());
		}catch(Exception ee){
			System.out.println("야 잘 좀 넣어");
		}finally{
			System.out.println("난 수행되어야 만 해!!!!");
		}
	}
}
```

## 63 수학 연산에서 발생하는 예외 처리하기
```java

```

## 64 Object 이해하고 사용하기
```java

```

## 65 Class를 이용하여 메서드와 생성자 살펴보기
```java

```

## 66 String(문자열)을 이용해 도시 이름 비교하기
```java

```

## 67 String(문자열) 가공하기
```java

```

## 68 리플렉션(Reflection)을 이용하여 클래스 정보 출력하기
```java

```

## 69 StringBuffer로 문자열 수정, 변경, 추가하기
```java

```

## 70 StringBuilder로 문자열 수정, 변경, 추가하기
```java

```

## 71 System으로 연산 소요 시간 구하기
```java

```

## 72 System으로 환경변수 확인하기
```java

```

## 73 수학 관련 메서드 사용하기
```java

```

## 74 Calendar로 살아온 날 구하기
```java

```

## 75 Calendar와 String 사이 날짜 변환하기
```java

```

## 76 Character를 이용하여 숫자와 특수문자 가려내기
```java

```

## 77 1차원 배열 이해하기
```java

```

## 78 문자열 1차원 배열 이해하기
```java

```

## 79 2차원 배열 이해하기
```java

```

## 80 박싱, 언박싱으로 기본 타입을 참조 타입으로 변환하기
```java

```

## 참고
[초보자를 위한 Java 200제, 2판](http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788956747859&orderClick=LEa&Kc=)