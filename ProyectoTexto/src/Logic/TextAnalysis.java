package Logic;

import java.util.StringTokenizer;

public class TextAnalysis {
	
	
	public static String[] Wordbyword(String texto) {
		String [] word = texto.split(" ");
		return word;
		
	}
	
	
	public static int sizeAtribute(String texto) {
		StringTokenizer tok= new StringTokenizer(texto);
		int size=tok.countTokens();
		return size;
	}
	

	public static int sizeArrayAtribute(String[] Word, int size) {
		
		int arraysize=0;
		boolean repeat;
		
		String [] arraynorept= new String[size];
		for(int i=0; i<size; i++) {
			repeat = true;
			for(int j=0; j<i; j++) {
				if(Word[i].equalsIgnoreCase(Word[j])) {repeat=false;}
			}
			if(repeat==true) {arraynorept[arraysize]=Word[i];  arraysize++;}
		}
		return arraysize;
		
	}
	
	
	
	public static String[] ArrayNoRepetitions(String[] Word, int size, int arraysize) {
		
		arraysize=0;
		boolean repeat;
		
		String [] arraynorept= new String[size];
		for(int i=0; i<size; i++) {
			repeat = true;
			for(int j=0; j<i; j++) {
				if(Word[i].equalsIgnoreCase(Word[j])) {repeat=false;}
			}
			if(repeat==true) {arraynorept[arraysize]=Word[i];  arraysize++;}
		}
		return arraynorept;
		
	}
	
				
	public static int[] WordCounter(String [] Array, String [] Word, int size, int arraysize) {
		
		int [] cont= new int[arraysize];
		String word;
		for(int i=0; i<arraysize; i++) {
			cont[i]=0;
			word=Array[i];
			for(int j=0; j<size; j++) {
				if(Word[j].equalsIgnoreCase(word)) {
					cont[i]=cont[i]+1;
				}	
				
			}
		
		}
		return cont;
		
	}
	
}
