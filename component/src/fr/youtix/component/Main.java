package fr.youtix.component;

import fr.youtix.component.addressbook.AddressBook;
import fr.youtix.component.emailer.Emailer;
import fr.youtix.component.emailer.IEmailing;
import fr.youtix.component.spellchecker.SpellChecker;
import fr.youtix.component.texteditor.IEditor;
import fr.youtix.component.texteditor.TextEditor;

public class Main {

	private static IEmailing emailer;

	private static void configureApplication() {
		IEditor editor = new TextEditor(new SpellChecker());
		emailer = new Emailer(editor, new AddressBook());
	}

	public static void main(String[] args) throws Exception {
		configureApplication();
		System.out.println(emailer.send());
	}

}
