
public class PrintClass {

	private String textToShow;
	protected short a;
	protected short b;

	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printText() {
		System.out.println(textToShow);
	}
	
	public void setA(short p_a) {
		a = p_a;
	}	
	
	public short getA() {
		return a;
	}
	
	public void setB(short p_b) {
		b = p_b;
	}
	
		
	public short getB() {
		return b;
	}
}