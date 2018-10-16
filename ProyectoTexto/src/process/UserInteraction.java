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
		String direction = io.readDirection();
		String Text= readText(direction);
		int sizeString=TextAnalysis.sizeAtribute(Text);
		String [] words=TextAnalysis.Wordbyword(Text);
		int sizeArray=TextAnalysis.sizeArrayAtribute(words, sizeString);
		String [] array=TextAnalysis.ArrayNoRepetitions(words, sizeString, sizeArray);
		int [] counter=TextAnalysis.WordCounter(array, words, sizeString, sizeArray);
		ResultCounter(counter, array, sizeArray);
		
	}
	
	private String readText(String direct) {
		
		String text= "";
		
		try {
			BufferedReader bf = new BufferedReader( new FileReader(direct));
			String temp="";
			String bfread;
			
			while((bfread=bf.readLine()) != null) {
				temp=temp+bfread;
			}
			text=temp;
			
		}catch(Exception e) {io.showErrorMessage("No se encontro archivo");}
		
		return text;
		
	}
	
	
	private void ResultCounter(int[] cont, String[] arr, int arraysize){
		
		io.showMessage(" '' \n");
		for(int i=0; i<arraysize; i++) {
			io.showResult(arr[i]+" = "+cont[i]);
		}
		io.showMessage("\n\n   ''");
	}	
	
}
