package n2;

import n2.Contacts.IContact;
import n2.Factories.BrContactFactory;
import n2.Factories.UsContactFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IContact> contactsList = new ArrayList<>();

        contactsList.add (new BrContactFactory().createContact("5133330000",
                "Rua da Praia, 123, Porto Alegre, RS"));
        contactsList.add (new BrContactFactory().createContact("51912341234",
                "Av Gen. Lima e Silva, 300, Porto Alegre, RS"));
        // Invalid BR number will save without number
        contactsList.add (new BrContactFactory().createContact("341234",
                "Av Ipiranga, 7200, Porto Alegre, RS"));
        contactsList.add (new UsContactFactory().createContact("9783426447",
                "60 Lawrence St, Fitchburg, MA"));
        contactsList.add (new UsContactFactory().createContact("7707570295",
                "134 Main Line Rd, Rockmart, GA"));

        for (IContact ic :
                contactsList) {
            ic.getContact();
        }




    }
}
