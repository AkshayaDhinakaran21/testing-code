package alert;

public class CharacterPattern {
	public static void main(String[] args) {
		int a,b,c , row= 9;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < (2*i-1); k++) {
					System.out.println("*");
				}
				if(i==j) {
					System.out.println(" ");
				}
				else {
					System.out.println(" ");
				}
			}
			
		}
	}

}
