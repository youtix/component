package fr.youtix.component.addressbook;

public class AddressBook implements IAddressBook /* Interface provided */ {

	public AddressBook() {}

	@Override
	public String getAddress() {
		return "address";
	}

}
