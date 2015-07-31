package eu.max.test;

import java.util.*;
import java.sql.Date;

public class PrintClass {
	
	private String textToShow;
	
	public PrintClass() {	}
	
	public void setTextToShow(String p_textToShow) {
		textToShow = p_textToShow;
	}
	
	public void printText() {
		System.out.println(textToShow);
	}
}