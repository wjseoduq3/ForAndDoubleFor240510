package for_02_240510;

public class DoubleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=0;
		//for (; i<5;i++) 
		for (int i=0;i<5;i++){
			for (int j=0;j<2;j++) {
				System.out.println("안녕!");
			}
		}
		
		
		for (int i = 2;i<10;i++) {
			for (int j = 1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("---------------------");
		}
		
		String result = "";
		String str = "*";
		for (int i=1;i<=5;i++) {
			result = result + str;
			System.out.println(result);
			}
		System.out.println("-----------");
		
		
		for (int i = 1; i<=5; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		

	}

}
