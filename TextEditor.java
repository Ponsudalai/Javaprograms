package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	//@Autowired
	private SpellChecker spellChecker;
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker=spellChecker;
	}

	/*public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	//@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}*/
	void textEditorFunction() {
		spellChecker.checkSpelling();
	}

}
