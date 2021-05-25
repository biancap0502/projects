package registration_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    private static GuestList guestList;


    public static void main(String[] args){
        sc = null;
        try{
            sc = new Scanner(new BufferedReader(new FileReader("./Ex/file")));
            System.out.println("Bun venit! Introduceti numarul de locuri disponibile:");
            int numberOfPlaces = sc.nextInt();
            guestList = new GuestList(numberOfPlaces);
            while(sc.hasNextLine()){
                String command = sc.nextLine();
                switch (command) {
                    case "help":
                        help();
                        break;
                    case "add":
                        add();
                        break;
                    case "check":
                        check();
                        break;
                    case "remove":
                        remove();
                        break;
                    case "update":
                        update();
                        break;
                    case "available":
                        available();
                        break;
                    case "guests_no":
                        guests_no();
                        break;
                    case "waitlist_no":
                        waitList_no();
                        break;
                    case "subscribe_no":
                        subscribe_no();
                        break;
                    case "guests":
                        guests();
                        break;
                    case "waitlist":
                        waitlist();
                        break;
                    case "search":
                        search();
                        break;
                    case "quit":
                        System.out.println("Aplicatia se inchide");
                }

            }
            sc.close();


        } catch (IOException e){
            System.out.println("Something wrong happened");
            e.printStackTrace();
        } finally {
            if (sc != null){
                sc.close();
            }
        }
    }

    public static void help() {
        System.out.println("help - Afiseaza aceasta lista de comenzi\r\n"  +
                "add - Adauga o noua persoana (inscriere)\r\n" +
                "check - Verifica daca o persoana este inscrisa la eveniment\r\n" +
                "remove - Sterge o persoana existenta din lista\r\n" +
                "update - Actualizeaza detaliile unei persoane\r\n" +
                "guests - Lista de persoane care participa la eveniment\r\n" +
                "waitlist - Persoanele din lista de asteptare\r\n" +
                "available - Numarul de locuri libere\r\n" +
                "guests_no - Numarul de persoane care participa la eveniment\r\n" +
                "waitlist_no - Numarul de persoane din lista de asteptare\r\n" +
                "subscribe_no - Numarul total de persoane inscrise\r\n" +
                "search - Cauta toti invitatii conform sirului de caractere introdus\r\n" +
                "quit - Inchide aplicatia");
    }

    private static void add() {
        System.out.println("Pentru a adauga o noua persoana introduceti datele de mai jos:");

        String firstName = askFirstName();
        String lastName = askLastName();
        String email = askEmail();
        String phone = askPhone();
        int response = guestList.add(new Guest(firstName, lastName, email, phone));
        switch (response) {
            case 0:
                System.out.println("[" + firstName + " " + lastName + "] Felicitari!"+
                        " Locul tau la eveniment este confirmat. Te asteptam!.");
                break;
            case -1:
                System.out.println("Persoana este deja inscrisa.");
                break;
            default:
                System.out.println("[" + firstName + " " + lastName + "] Te-ai inscris cu"+
                        " succes in  lista de asteptare si a primit numarul de ordine " +
                        response + ".Te vom notifica daca  un loc devine disponibil.");
        }
    }


    private static void check() {
        boolean ceckResponse = false;
        String response =  ask("Alegeti modul de verificare:" +
                "\n\t\"1\" - Nume si prenume" +
                "\n\t\"2\" - Email" +
                "\n\t\"3\" - Numar de telefon (format \"+40733386463\")");
        switch(response) {
            case "1":

                String firstName = askFirstName();
                String lastName = askLastName();
                ceckResponse = guestList.checkByName(firstName,lastName);
                System.out.println("Persoana este inscrisa la eveniment: " + ceckResponse);
                break;
            case "2":
                String email = askEmail();
                ceckResponse =  guestList.checkByEmail(email);
                System.out.println("Persoana este inscrisa la eveniment: " + ceckResponse);
                break;
            case "3":
                String phone = askPhone();
                ceckResponse =  guestList.checkByPhone(phone);
                System.out.println("Persoana este inscrisa la eveniment: " + ceckResponse);
                break;
            default:
                System.out.println("Comanda introdusa este invalida");
        }

    }

    private static void remove() {
        int remove = -1;
        String response =  ask("Alegeti modul de cautare:" +
                "\n\t\"1\" - Nume si prenume" +
                "\n\t\"2\" - Email" +
                "\n\t\"3\" - Numar de telefon (format \"+40733386463\")");
        switch(response) {
            case "1":
                String firstName = askFirstName();
                String lastName = askLastName();
                remove = guestList.removeByName(firstName, lastName);
                break;
            case "2":
                String email = askEmail();
                remove = guestList.removeByEmail(email);
                break;
            case "3":
                String phone = askPhone();
                remove = guestList.removeByPhone(phone);
                break;
            default:
                System.out.println("Nu ati tastat una dintre optiunile valabile");
        }

        if (remove == 0) {
            System.out.println("Stergerea persoanei s-a realizat cu succes");
        } else if (remove == 1) {
            System.out.println("Stergerea persoanei s-a realizat cu succes.");
            ArrayList<Guest> guests = guestList.getGuestList();
            int placesNo = Main.guestList.getAvailablePlaces();
            Guest transferredGuest = guests.get(placesNo - 1);
            System.out.println(transferredGuest.getLastName() + " " + transferredGuest.getFirstName() +
                    " a fost transferat/a pe lista de participanti.");
        } else {
            System.out.println("Eroare: Persoana nu este inscrisa la eveniment.");
        }
    }

    private static void update() {
        Guest sameGuest;
        String response =  ask("Alegeti modul de cautare:" +
                "\n\t\"1\" - Nume si prenume" +
                "\n\t\"2\" - Email" +
                "\n\t\"3\" - Numar de telefon (format \"+40733386463\")");
        switch(response) {
            case "1":

                String firstName = askFirstName();
                String lastName = askLastName();
                sameGuest = guestList.getByName(firstName, lastName);
                if (sameGuest == null) {
                    System.out.println("Eroare: Datele introuse nu corespund.");
                    break;
                }
                updateByCriteria(sameGuest);
            case "2":
                String email = askEmail();
                sameGuest = guestList.getByEmail(email);
                if (sameGuest == null) {
                    System.out.println("Eroare: Datele introuse nu corespund.");
                    break;
                }
                updateByCriteria(sameGuest);
                break;
            case "3":
                String phone = askPhone();
                sameGuest = guestList.getByPhone(phone);
                if (sameGuest == null) {
                    System.out.println("Eroare: Datele introuse nu corespund.");
                    break;
                }
                updateByCriteria(sameGuest);
                break;
            default:
                System.out.println("Comanda introdusa nu este valida");
        }
    }

    public static void updateByCriteria(Guest guest) {
        String response =  ask("Alegeti modul de actualizare:" +
                "\n\t\"1\" - Nume" +
                "\n\t\"2\" - Prenume" +
                "\n\t\"3\" - Email" +
                "\n\t\"4\" - Numar de telefon (format \"+40733386463\")");
        switch(response) {
            case "1":
                String updateLastName = askLastName();
                guest.setLastName(updateLastName);
                break;
            case "2":
                String updateFirstName = askFirstName();
                guest.setFirstName(updateFirstName);
                break;
            case "3":
                String updateEmail = askEmail();
                guest.setEmail(updateEmail);
                break;
            case "4":
                String updatePhoneNo = askPhone();
                guest.setPhoneNumber(updatePhoneNo);
                break;
            default:
                System.out.println("Comanda introdusa nu este valida.");
        }
    }

    private static void guests() {
        ArrayList<Guest> guestList = Main.guestList.getGuestList();
        int placesNo = Main.guestList.getAvailablePlaces();
        if (guestList.size() >= placesNo) {
            for (int i = 0; i < placesNo; i++) {
                System.out.println(guestList.get(i));
            }
        } else if (guestList.size() < placesNo) {
            for (int i = 0; i < guestList.size(); i++) {
                System.out.println(guestList.get(i));
            }
        } else {
            System.out.println("Lista de participanti este goala...");
        }
    }

    private static void waitlist() {
        ArrayList<Guest> guestList = Main.guestList.getGuestList();
        int placesNo = Main.guestList.getAvailablePlaces();
        if (guestList.size() > placesNo) {
            for (int i = placesNo; i < guestList.size(); i++) {
                System.out.println(guestList.get(i));
            }
        } else {
            System.out.println("Lista de asteptare este goala...");
        }
    }

    private static void available() {
        System.out.println("Numarul total de locuri libere: " + guestList.getNumberAvailablePlaces());
    }

    private static void guests_no() {
        System.out.println("Numarul total de participanti: " + guestList.getNumberOfParticipants());
    }

    private static void waitList_no() {
        System.out.println("Numar de persoane pe lista de asteptare " + guestList.getNumberOnWaitingList());
    }

    private static void subscribe_no() {
        System.out.println("Numar total de persoane inscrise: " + guestList.getTotalRegistered());
    }

    private static void search() {
        String searchStr = ask("Introduceti sirul de caractere cautat:");
        ArrayList<Guest> result = guestList.search(searchStr);
        if (result.isEmpty()) {
            System.out.println("Nu exista persoane care corespund cu sirul introdus.");
        } else {
            for (Guest guest: result) {
                System.out.println(guest);
            }
        }
    }

    private static String ask(String question) {
        System.out.println(question);
        return sc.nextLine();
    }

    private static String askFirstName() {
        return ask("Prenume:");
    }

    private static String askLastName() {
        return ask("Nume:");
    }

    private static String askEmail() {
        return ask("Email:");
    }

    @SuppressWarnings("LossyEncoding")
    private static String askPhone() {
        return ask("Telefon (format �+40733386463�)");
    }


}

