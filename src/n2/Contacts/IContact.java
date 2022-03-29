package n2.Contacts;

public interface IContact {

    void getPhone ();
    void getAddress ();
    void getContact ();
    void setContact (String newPhone, String newAddress);
    void setPhone (String newPhone);
    void setAddress(String newAddress);
}
