package fr.youtix.component.emailer;

import fr.youtix.component.addressbook.IAddressBook;
import fr.youtix.component.texteditor.IEditor;

public class Emailer implements IEmailing /* Interface provided */ {
	
	/* Interface required */
	public IEditor editor;
	/* Interface required */
	public IAddressBook addressBook;
	
	public Emailer(IEditor editor, IAddressBook addressBook) {
		this.editor = editor;
		this.addressBook = addressBook;
	}

	public boolean send() throws Exception {
		String msg = editor.getMessage();
		String address = addressBook.getAddress();
		return sendMessage(msg, address);
	}

	private boolean sendMessage(String msg, String address) {
		return true;
	}
}
