package eu.max.test;

import java.util.*;
import java.sql.Date;

public class Printer {

	private String textToShow;
	private int b;
	
	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printTextToShow() {
		System.out.println(textToShow);
	}
	
	public short getA() {
		return a;
	}
}