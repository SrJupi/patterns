package n2.Contacts;

import java.util.Scanner;

public class BrContact implements IContact{
    final private String PREFIX = "+55";
    final private String COUNTRY = "Brazil";
    final private int PHONE_MIN_SIZE = 10;
    final private int PHONE_MAX_SIZE = 11;
    private String phone;
    private String address;

    public BrContact (String newPhone, String newAddress){
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
        if (newPhone.length() == PHONE_MIN_SIZE || newPhone.length() == PHONE_MAX_SIZE){
            this.phone = newPhone;
        }else{
            this.phone = " - Número inválido";
        }

    }

    @Override
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

}
