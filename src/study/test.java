package study;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class test implements testInterface{
	static FileInputStream fis;
	static DataInputStream dis;
	
	public int rename;

	public int getRename() {
		return rename;
	}

	public void setRename(int rename) {
		this.rename = rename;
	}
	
	public test() {
	}
	
	public test(int name) {
		this.rename = name;
	}
	
	public test(int a, int b){
		this.rename = a - b > 0?a:b;
	}
	

	public static void main(String[] args) {
		a();
	}

	public static void a(){
		int sum = 0;
		int score = 0;
		
		try {
			fis	= new FileInputStream("C://score.dat");
			dis= new DataInputStream(fis);
			
			while(true){
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {
			System.out.println(sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null){
					dis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void testf3() {
		// TODO Auto-generated method stub
		
	}
}
