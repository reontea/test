package study;

public class ChristmasTree {
	public static void main(String[] args) {
		for(int i=5; i <14; i+=4){
			for(int j=0; j<i; j+=2){
				for(int m=0; m<=6-(j/2); m++){
					System.out.print(" ");
				}			
				for(int k=0; k<=j; k++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Merry Christmas!");
	}
}
