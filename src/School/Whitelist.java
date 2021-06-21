package School;

public class Whitelist{

    private String firstName;
    private String lastName;
    private String address;
    private int emergencyContact;

    //Constructer method
    public Whitelist(String firstN, String lastN, String ad, int emContact){

        firstName = firstN;
        lastName = lastN;
        address = ad;
        emergencyContact = emContact;

    }

    //Getter method for first name
    public String getFirstName(){

        return firstName;

    }

    //Getter method for last name
    public String getLastName(){

        return lastName;

    }

    //Getter method for address
    public String getAddress(){

        return address;

    }

    //Getter method for emergency contact
    public int getEmergencyContact(){

        return emergencyContact;

    }

}