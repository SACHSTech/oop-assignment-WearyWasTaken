package School;

public class Teacher extends Whitelist{
    
    private int teacherSalary;

    //Constructor method
    public Teacher(String firstN, String lastN, String ad, int emContact, int teachSalary){

        super(firstN, lastN, ad, emContact);
        teacherSalary = teachSalary;

    }

    //Getter method for teacher salary
    public int getTeacherSalary(){

        return teacherSalary;

    }

    //Returns a string describing info about the teacher class
    public String toString(){

        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Emergency Contact: " + getEmergencyContact());
        System.out.println("Salary: " + getTeacherSalary());
        return "";

    }

    //Setter method for teacher salary
    public void setSalary(int newSalary){

        teacherSalary =  newSalary;

    }

}