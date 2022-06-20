import java.util.Scanner; //import Scanner class from java.util package
import java.lang.String; //import String class from java.lang package

public interface EmergencyServices { //interface with methods to be implemented later on in classes
    void sos();
}

class Emergency implements EmergencyServices { //Emergency implements interface's sos() method
    int emergencyService; //integer variable to be used when user dials Emergency Services' hotline
    String emergencyReceiver; //String variable to be used when user calls a specific Emergency Service

    public void sos() {
        Scanner emerge = new Scanner(System.in); //create Scanner object emerge
        System.out.println("Would you like to call Emergency Services? Dial 999 to do so"); //system asks user to dial 999 if they want to call Emergency Services
        emergencyService = emerge.nextInt(); //user inputs Emergency Services' hotline
        if (emergencyService==999){
            Scanner emergeRec = new Scanner(System.in); //create Scanner object emergeRec
            System.out.println("Press 1 for Ambulance, 2 for Fire Services, 3 for Police"); //System asks user to dial 1 for Ambulance, 2 for Fire Service, 3 for Police
            emergencyReceiver = emergeRec.nextLine(); //user inputs 1, 2 or 3
            if (emergencyReceiver.equals("1")){
                System.out.println("Ambulance has been contacted"); //if user inputs 1, Ambulance is called
            }
            else if (emergencyReceiver.equals("2")){
                System.out.println("Fire Service has been contacted"); //if user inputs 2, Fire Service is called
            }
            else if (emergencyReceiver.equals("3")){
                System.out.println("Police has been contacted"); //if user inputs 3, Police is called
            }
            else System.out.println("Error: invalid input"); //if user inputs anything other than 1 or 2 or 3, error message pops up
        }
        else System.out.println("Error: invalid input"); //if user inputs anything other than 999, error message pops up
    }
}

class Main{ //Main class to display all methods
    public static void main(String[] args){ //main() method
        Login log = new Login(); //creates object log of Login class
        CallContact cont = new CallContact(); //creates object cont of CallContact class
        Emergency emr = new Emergency(); //creates object emr of Emergency class
        log.createAccount(); //object log calls createAccount() method
        log.deleteAccount(); //object log calls deleteAccount() method
        log.login(); //object log calls login() method
        cont.addContact(); //object cont calls addContact() method
        cont.removeContact(); //object cont calls removeContact() method
        cont.callContact(); //object cont calls callContact() method
        emr.sos(); //object emr calls sos() method
    }
}