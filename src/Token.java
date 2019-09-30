
public class Token {
	
	public static int count = 0;
	
	private String symbol;
	
	Token(String symbol) {
		this.symbol = symbol;
		count++;
	}
	
	public void Draw() {
		System.out.print(symbol);
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
}
