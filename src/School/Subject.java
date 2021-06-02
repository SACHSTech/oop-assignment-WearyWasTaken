package School;


public class Subject{

    private int gradeLevel;
    private String courseType;
    private String courseDifficulty;
    private boolean isCoop;
    
    //Constructor method
    public Subject(int gr, String type, String diff, boolean coop){

        gradeLevel = gr;
        courseType = type;
        courseDifficulty = diff;
        isCoop = coop;

    }

    //Getter method for grade level
    public int getGradeLevel(){

        return gradeLevel;

    }

    //Getter method for course type
    public String getCourseType(){

        return courseType;

    }

    //Getter method for difficulty
    public String getCourseDifficulty(){

        return courseDifficulty;

    }

    //Getter method for coop
    public boolean getIsCoop(){

        return isCoop;

    }

    //Returns a string with info about the Subject class
    public String toString(){

        System.out.println("Grade Level: " + getGradeLevel());
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Course Difficulty" + getCourseDifficulty());
        System.out.println("Coop: " + isCoop);
        return "";

    }

}