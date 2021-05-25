package registration_management_system;

public class Guest {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Guest(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean fieldContainsSubstr(String str) {
        return this.firstName.toLowerCase().contains(str) ||
                this.lastName.toLowerCase().contains(str) ||
                this.email.toLowerCase().contains(str) ||
                this.phoneNumber.toLowerCase().contains(str);
    }

    @Override
    public String toString() {
        return "First name: " + this.firstName +
                " last name: " + this.lastName +
                " email: " + this.email +
                " phone number: " + this.phoneNumber;
    }


    public boolean isEqualTo(Guest guestObj) {
        if (guestObj.firstName != null && guestObj.lastName != null){
            if (this.firstName.equals(guestObj.firstName) &&
                    this.lastName.equalsIgnoreCase(guestObj.lastName)) return true;
        }
        if (guestObj.email != null){
            if (this.email.equals(guestObj.email)) return true;
        }
        if (guestObj.phoneNumber != null){
            if (this.phoneNumber.equals(guestObj.phoneNumber)) return true;
        }
        return false;
    }

}
