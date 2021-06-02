package School;


public class Student extends Whitelist{

    private int grade;
    
    public Student(String firstN, String lastN, String ad, int emContact, int theGrade){

        super(firstN, lastN, ad, emContact);
        grade = theGrade;

    }

    public int getGrade(){

        return grade;

    }

    public void setGrade(int newGrade){

        grade = newGrade;

    }

    public String toString(){

        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Emergency Contact: " + getEmergencyContact());
        System.out.println("Grade: " + getGrade());
        return "";

    }

}