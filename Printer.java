package eu.max.test;

import java.util.*;

public class Printer extends Object implements Iterable, Iterator {

	private String textToShow;
	private int b;
	
	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printTextToShow() {
		System.out.println("TextToShow: ");
		System.out.println(textToShow);
	}
	
	public short setB(int p_b) {
		System.out.println("setting b to " + p_b);
		b = p_b;
	}
	
	public short getB() {
		return b;
	}	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected long addition(int summand1, int summand2) {
		long summe;
		summe = summand1 + summand2;
		return summe;
	}
}