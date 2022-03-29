package n2.Contacts;

public class UsContact implements IContact{
    final private String PREFIX = "+1";
    final private String COUNTRY = "United States";
    final private int PHONE_SIZE = 10;
    private String phone;
    private String address;

    public UsContact (String newPhone, String newAddress){
        setContact(newPhone, newAddress);
    }

    @Override
    public void setContact(String newPhone, String newAddress) {
        setPhone(newPhone);
        setAddress(newAddress);
    }

    @Override
    public void getPhone() {
        System.out.println(PREFIX + phone);
    }

    @Override
    public void getAddress() {
        System.out.println(address);
    }

    @Override
    public void getContact(){
        System.out.println("Address: " + address + ", " + COUNTRY);
        System.out.println("Phone: " + PREFIX + phone);
    }

    @Override
    public void setPhone(String newPhone) {
        if (newPhone.length() == PHONE_SIZE){
            this.phone = newPhone;
        }else{
            this.phone = " - Phone number incorrect";
        }

    }

    @Override
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

}
