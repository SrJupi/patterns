package n2.Factories;

import n2.Contacts.IContact;

public interface AbstractFactory {
    public IContact createContact (String newPhone, String newAddress);

}
