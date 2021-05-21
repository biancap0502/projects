package registration_management_system;

import java.util.ArrayList;

public class GuestList {

    private int availablePlaces;
    private ArrayList<Guest> guestList = new ArrayList<Guest>();

    public GuestList(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public int getAvailablePlaces() {
        return this.availablePlaces;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public int add(Guest guest) {
        if (guestList.contains(guest)) { // already registered
            return -1;
        } else if (guestList.size() < availablePlaces) {  // add in participantList
            guestList.add(guest);
            return 0;
        } else {
            guestList.add(guest);
            return guestList.size() - availablePlaces; // add in waitlingList
        }
    }

    // the method checks if the person is registered
    public boolean check(Guest guest) {
        for (Guest person: guestList) {
            if (person.isEqualTo(guest)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkByName(String firstName, String lastName) {
        return check(new Guest(firstName, lastName,"",""));
    }

    public boolean checkByPhone(String phoneNumber) {
        return check(new Guest("", "", "", phoneNumber));
    }

    public boolean checkByEmail(String email) {
        return check(new Guest("","",email,""));
    }


    public int getIndexOfSameObj(Guest sameGuest){
        for (int i = 0; i < guestList.size(); i++){
            if (this.guestList.get(i).isEqualTo(sameGuest)){
                return i;
            }
        }
        return -1;
    }


    public int remove(Guest guest) {
        int indexGuestList = getIndexOfSameObj(guest);
        if (indexGuestList >= 0) {
            this.guestList.remove(indexGuestList);
            if (indexGuestList < this.availablePlaces && this.guestList.size() > this.availablePlaces) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public int removeByName(String firstName, String lastName) {
        return remove(new Guest(firstName, lastName, "", ""));
    }

    public int removeByEmail(String email) {
        return remove(new Guest("","",email,""));
    }

    public int removeByPhone(String phoneNumber) {
        return remove(new Guest("","","",phoneNumber));
    }

    // the method gets the object in order to update it
    public Guest getSameObj(Guest sameGuest) {
        int indexOfSameObj = getIndexOfSameObj(sameGuest);
        Guest guest = null;
        if (indexOfSameObj >= 0) {
            guest = guestList.get(indexOfSameObj);
        }
        return guest;
    }

    public Guest getByName(String firstName, String lastName) {
        return getSameObj(new Guest(firstName, lastName, "", ""));
    }

    public Guest getByEmail(String email) {
        return getSameObj(new Guest("","",email,""));
    }

    public Guest getByPhone(String phone) {
        return getSameObj(new Guest("", "","", phone));
    }

    public int getNumberAvailablePlaces() {
        if (this.guestList.size() < this.availablePlaces) {
            return this.availablePlaces - this.guestList.size();
        }
        return 0;
    }

    public int getNumberOfParticipants() {
        if (this.guestList.size() < this.availablePlaces) {
            return guestList.size();
        }
        return this.availablePlaces;
    }

    public int getNumberOnWaitingList() {
        if (this.guestList.size() > this.availablePlaces) {
            return guestList.size() - this.availablePlaces;
        }
        return 0;
    }

    public int getTotalRegistered() {
        return this.guestList.size();
    }


    // the method returns the list of guests that contains the given string
    public ArrayList<Guest>search(String str){
        str = str.toLowerCase();
        ArrayList<Guest> result = new ArrayList<>();
        for (Guest guest: guestList) {
            if (guest.fieldContainsSubstr(str)) {
                result.add(guest);
            }
        }
        return result;
    }

}
