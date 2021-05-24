# Registration management system
 This project implements a registration management system for keeping track of people registered at an event.
 <br />A usage scenario can be found in the file [TestRMS.md](https://github.com/biancap0502/projects/commit/73d4423df7a88a24e7970af8a6fe5ca4732ceac7).
 
 ## Project description
 The application keeps track of people using two lists: the list of participants and the waiting list.
 <br /> The commands used in the application are:
 - help (Displays the list of commands)
 - add (Adds a new person)
 - check (Checks if a person is registered for the event)
 - remove (Deletes a person from the list)
 - update (Updates a persons's details)
 - guests (Displays the list of people on participants list)
 - waitlist (Displays people on the waiting list)
 - available (Displays the number of free places)
 - guests_no (Displays the number of people on participants list)
 - waitlist_no (Displays the number of people on waiting list)
 - subscribe_no (Displays the total number of people registered)
 - search (Searches for all guests according to the string entered)
 - quit (Closes the application)

## Implementation details

[**Main class**](https://github.com/biancap0502/projects/blob/master/registration_management_system/Main.java).

The main class is used for the interaction with the application. It contains an instance of the GuestList class and a method for each command used in the application (those described above)
 and the input is read from a text file.
 
 [**Guest class**](https://github.com/biancap0502/projects/blob/master/registration_management_system/Guest.java).
 
 A person who has registered for the event is represented by a Guest object. This class has the following fields: first name, last name, email and phone number and getters and setters for these fields.
   Also, the class has the method fieldContainsSubstr(String) that return true if any field of the object contains the string received as a parameter or false otherwise.
	 
[**GuestList class**](https://github.com/biancap0502/projects/blob/master/registration_management_system/GuestList.java).	 

This class is the most important class of the application. The fields of this class are: an integer that represents the number of available places at the event and a list of people who want 
to attend at the event.
 <br />The methods: checkByName(String, String), checkByEmail(String), checkByPhone(String), removeByName(String, String), removeByEmail(String), removeByPhone(String), 
 getByName(String, String), getByEmail(String), getByPhone(String) receive as arguments the variables according to which the search is performed and by calling a generic method 
 (check(Guest), remove(Guest) or getSameObj(Guest)) verifies, removes or returns the object existing in the list that has as proprieties the variables received at the method call.
<br /> The generic methods mentioned above use another generic method: getIndexOfSameObj(Guets) that returns the index of the object received as an argument.
	 
	 
 
 
 
 
