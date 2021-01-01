package day04_01;
public class Day04_04 {
	public static void main(String[] args) {
		int var1;
		if(true) {
			int var2;
			var1 = 10;
			var2 = 20;
			System.out.println("var1 : " + var1);
			System.out.println("var2 : " + var2);
		}
		var1 = 10;
		//var2 = 20;
		
		for(int i=0; i<1; i++) {
			int var3;
			var1 = 10;
			//var3 = 30;
			System.out.println("for var1 : " + var1);
			//System.out.println("for var3 : " + var3);
		}
		var1 = 10;
		//var3 = 30;
		System.out.println("bottom var1 : " + var1);
		//System.out.println("bottom var3 : " + var3);
	}
}