package com.edu;

public class Texteditor {
	private Spellchecker spellChecker, spellChecker1;
	
	
	public Texteditor(Spellchecker spellChecker) {
		this.spellChecker=spellChecker;
	}
public void textEditor() {
	if(spellChecker!=null) {
		System.out.println("The Dictonary");
		spellChecker.checkSpelling();
	}
	else
	{
		System.out.println("Not Checking");
	}
	}
	
}
