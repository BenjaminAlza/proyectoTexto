package io;

import process.InputOutputInterface;
import java.util.Scanner;

public class InputOutputImplement implements InputOutputInterface {
	
	Scanner leer;
	
	public InputOutputImplement(){
		leer = new Scanner(System.in);
	}
	
	public String readString() {
		return leer.nextLine();
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public void showErrorMessage(String message) {
		System.err.println(message);
	}
	
	public void showResult(String message) {
		System.out.println(message);
	}
	

}
	