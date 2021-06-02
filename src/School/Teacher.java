package School;

public class Teacher extends Whitelist{
    
    private int teacherSalary;

    public Teacher(String firstN, String lastN, String ad, int emContact, int teachSalary){

        super(firstN, lastN, ad, emContact);
        teacherSalary = teachSalary;

    }

    public int getTeacherSalary(){

        return teacherSalary;

    }

    public String toString(){

        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Emergency Contact: " + getEmergencyContact());
        System.out.println("Salary: " + getTeacherSalary());
        return "";

    }

    public void setSalary(int newSalary){

        teacherSalary =  newSalary;

    }

}