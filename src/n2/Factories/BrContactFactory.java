package n2.Factories;

import n2.Contacts.BrContact;
import n2.Contacts.IContact;
import n2.Contacts.UsContact;

public class BrContactFactory implements AbstractFactory {
    @Override
    public IContact createContact(String newPhone, String newAddress) {
        return new BrContact(newPhone, newAddress);
    }
}
