
public class addTwo {
	
	private int a;
	private int b;
	private int sum;
	
	static int count = 0;
	
	addTwo() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void setA(int a) {
		this.a = a;
		sum = a + b;
	}
	
	public void setB(int b) {
		this.b = b;
		sum = a + b;
	}
	
	public int getSum() {
		return sum;
	}

}
