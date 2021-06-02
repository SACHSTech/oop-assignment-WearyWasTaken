package School;


public class Subject{

    private int gradeLevel;
    private String courseType;
    private String courseDifficulty;
    private boolean isCoop;
    
    public Subject(int gr, String type, String diff, boolean coop){

        gradeLevel = gr;
        courseType = type;
        courseDifficulty = diff;
        isCoop = coop;

    }

    public int getGradeLevel(){

        return gradeLevel;

    }

    public String getCourseType(){

        return courseType;

    }

    public String getCourseDifficulty(){

        return courseDifficulty;

    }

    public boolean getIsCoop(){

        return isCoop;

    }

    public String toString(){

        System.out.println("Grade Level: " + getGradeLevel());
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Course Difficulty" + getCourseDifficulty());
        System.out.println("Coop: " + isCoop);
        return "";

    }

}