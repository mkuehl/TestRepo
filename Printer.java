package eu.max.test;

import java.util.*;
import java.sql.Date;

public class PrintClass {
	
	private String textToShow;
	protected short a;
	
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
}