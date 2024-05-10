package for_02_240510;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;		
		}
		
		
		int j = 0;
		while (true) {
			j++;
			System.out.println(j);
			if (j==1000) {
				break;
			}
		}
		
		
		do {
			System.out.println("안녕!");
		} while(false);
		
		
		for(int k=1;k<=10;k++) {
			if(k%3==0) {
				continue;			
			}
			System.out.println(k);
		}
		

	}

}
