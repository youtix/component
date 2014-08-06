package fr.youtix.component.spellchecker;

public class SpellChecker implements ISpellChecker /* Interface required */ {

	public SpellChecker() {}

	@Override
	public boolean spellCheck(String msg) {
		return !msg.isEmpty();
	}

}
