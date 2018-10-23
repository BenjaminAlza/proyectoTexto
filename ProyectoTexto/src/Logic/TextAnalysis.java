package Logic;

import java.util.StringTokenizer;

public class TextAnalysis{
				
	public int arraysize;
	
	public String [] WordFinder(String text) {

		arraysize=0;
		StringTokenizer token= new StringTokenizer(text);
		int size=token.countTokens();
		String[] words = text.split("\\s+");
		
		String[] array= new String[size];
		boolean repeat;
		for(int i=0; i<size; i++) {
			repeat = true;
			for(int j=0; j<i; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {repeat=false;}
			}
			if(repeat==true) {array[arraysize]=words[i];  arraysize++;}
			
		}	
		return array;
		
	}
	
    public int[] WordCounter(String text) {
    	
		StringTokenizer token= new StringTokenizer(text);
		int size=token.countTokens();
		String[] words = text.split("\\s+");
    	String [] arrayaux=WordFinder(text);
		int [] cont= new int[arraysize];
		String bufferword;
		for(int i=0; i<arraysize; i++) {
			cont[i]=0;
			bufferword=arrayaux[i];
			for(int j=0; j<size; j++) {
				if(words[j].equalsIgnoreCase(bufferword)) {
					cont[i]++;
				}	
			}
		}
		return cont;
		
	}	
	
}



