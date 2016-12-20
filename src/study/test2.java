package study;

public class test2 {

	public static void main(String[] args) {
//		Car a = new Car(1);
//		Car b = a;
//		b.speed = 2;
//		
//		System.out.println(a.speed);
		
		String a = new String("asdfg");
		String b = a;
		System.out.println(b.toString());
	
	}

}



class Car {
	public int speed;
	
	public Car(int speed) {
		this.speed = speed;
	}
}