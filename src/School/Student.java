package School;


public class Student extends Whitelist{

    private int grade;
    
    //Constructor method
    public Student(String firstN, String lastN, String ad, int emContact, int theGrade){

        super(firstN, lastN, ad, emContact);
        grade = theGrade;

    }

    //Getter method for grade
    public int getGrade(){

        return grade;

    }

    //Setter method for grade
    public void setGrade(int newGrade){

        grade = newGrade;

    }

    //Returns a string describing info in the student class
    public String toString(){

        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Emergency Contact: " + getEmergencyContact());
        System.out.println("Grade: " + getGrade());
        return "";

    }

}