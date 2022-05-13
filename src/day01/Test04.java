package day01;
/*
  bit : 2진수의 한자리가 1bit
  1byte : 8bit
  type		크기(byte)	범위
  ---------------------------
  byte		 1		-128 ~ 127
  short		 2		-32768 ~ 32767
  *char		 2		0 ~ 65535
  *int		 4
  float		 4
  *double	 8
  void		 값을 갖지 않는 특수한 데이터 형
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int age = 25; //int : 정수(음양) 표현
		double weight = 55.0; // 실수 표현
		double height = 160.0;
		System.out.println("나의 나이는 "+age+"살");
		System.out.println("나의 키는 "+height+"cm");
		System.out.println("나의 무게는 "+weight+"kg");
		//char문자 하나 표현할 때 사용
		//문자 하나는 작은 따옴표로 표현해야 한다.
		char ch = 'A';
		System.out.println("변경 전 : "+ch);
		ch = 'B';
		System.out.println("변경 후 : "+ch);
		
		System.out.println("연산 : "+ (ch+32) );
		System.out.println("연산 : "+ (char)(ch+32) );
		System.out.println("연산 : "+ (double)(ch+32) );
		System.out.println( 1.111 );
		System.out.println( (int)12.111 );
		
		String n = "홍길동"; //문자열 저장
		System.out.println(n+"님 안녕하세요");
		n = "김개똥";
		System.out.println("이름 변경 : "+n);
		*/
		String n =  "김말이";
		int age = 20;
		double height = 173.3;
		int IQ = 120;
		char grade = 'B';
		System.out.println("이름	 : "+n);
		System.out.println("나이	 : "+age);
		System.out.println("키	 : "+height);
		System.out.println("아이큐	 : "+IQ);
		System.out.println("등급	 : "+grade);
		
	}

}
