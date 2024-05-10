package for_02_240510;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i;  에전스타일
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		for (int j=1;j<=100;j++) {
			System.out.println(j);
		}
		
		
		for (int k=100;k>0;k--) {
			System.out.println(k);
		}
		
		
		int sum = 0;
		for (int i =1;i<=100;i++) {
			sum = sum + i;		
		}
		System.out.println("sum의 값: " + sum);

		int sumOf3 = 0; 
		for (int l=1;l<=100;l++) {
			if (l % 3==0) {
				sumOf3 = sumOf3 + l;
			} 
		}
		System.out.println("3의배수의 합: " + sumOf3);
		
		
		int sumOf3_1 = 0;
		for (int i=3;i<=100;i=i+3) {
			sumOf3_1 = sumOf3_1 + i;
		}
		System.out.println("3의배수의 합: " + sumOf3_1);
	}

}
