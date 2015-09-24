package eu.max.test;

import java.util.*;

public class Printer implements Iterable {

	private String textToShow;
	private int b;
	
	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printTextToShow() {
		System.out.println(textToShow);
	}
	
	public short setB(int p_b) {
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
}