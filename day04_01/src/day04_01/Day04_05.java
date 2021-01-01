package day04_01;
public class Day04_05 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println("if v1 : " + v1);
			System.out.println("if v2 : " + v2);
		}
		System.out.println("bottom v1 : " + v1);
		//System.out.println("bottom v2 : " + v2);
		// int v3 = v1 + v2 + 5;  //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}
}