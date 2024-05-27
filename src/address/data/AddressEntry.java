package address.data;

public class AddressEntry {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    Integer zip;
    String phone;
    String email;

    AddressEntry(){

    }
    AddressEntry(String firstName, String lastName, String street, String city, String state, Integer zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = this.lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        street = this.street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        city = this.city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }
    public void setZip(Integer zip) {
        zip = this.zip;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        phone = this.phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        email = this.email;
    }
}
