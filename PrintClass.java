package eu.max.test;

import java.util.*;
import java.sql.Date;

public class PrintClass extends Object implements TestInterface1, TestInterface2 {

	private String textToShow;
	protected short a;
	protected short b;
	private short c;
		
	private short d;

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
	
	public void setC(short p_c) {
		c = p_c;
	}
	
	public short getC() {
		return c;
	}
	
	public void setD(short p_d) {
		d = p_d;
	}
	
	public short getD() {
		return d;
	}
	
	public int addAB() {
		return a + b;
	}
}