package eu.max.test;

import java.util.*;
import java.sql.Date;

public class Printer {

	private String textToShow;
	protected short a;
	
	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printText() {
		System.out.println(textToShow);
	}
	
	public short getA() {
		return a;
	}
}