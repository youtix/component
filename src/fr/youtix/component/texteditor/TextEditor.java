package fr.youtix.component.texteditor;

import fr.youtix.component.spellchecker.ISpellChecker;

public class TextEditor implements IEditor /* Interface provided */ {
	
	/* Interface required */
	public ISpellChecker checker;
	
	public TextEditor(ISpellChecker checker) {
		this.checker = checker;
	}

	public String getMessage() throws Exception {
		String msg = getUserInput();
		boolean isCorrect = checker.spellCheck(msg);
		if (isCorrect)
			return msg;
		
		throw new Exception("message not correct");
	}

	private String getUserInput() {
		return "message";
	}
}
