package process;

import java.io.*;
import Logic.TextAnalysis;

public class UserInteraction {
	
	InputOutputInterface io;
	
	public UserInteraction(InputOutputInterface io) {
		this.io= io;
	}
	
	public void runUserInteraction() {
		
		io.showMessage("Ingrese la direccion del archivo: ");
		String direction = io.readString();
		String Text= readText(direction);
		TextAnalysis t1= new TextAnalysis();
		String [] Words=t1.WordFinder(Text);
		int[] Counter=t1.WordCounter(Text);
		for(int i=0; i<t1.arraysize; i++) {
			io.showResult(Words[i]+" = "+Counter[i]);
		}
		
	}
	
	private String readText(String direct) {
		
		String text= "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direct), 100);
			String temp="";
			String bfread;
			while((bfread=bf.readLine()) != null) {
				temp=temp+bfread;
			}
			text=temp;
		}catch(Exception e) {io.showErrorMessage("No se encontro archivo");}
		
		return text;
		
	}
	
}	



