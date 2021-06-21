package School;


import java.util.ArrayList;

public class Classroom{

    private Teacher teacher;
    private Subject subject;
    private ArrayList<Student> students;

    //Constructor method
    public Classroom(Teacher theTeacher, Subject theSubject){
        
        teacher = theTeacher;
        subject = theSubject;
        students = new ArrayList<Student>();

    }

    //Adds a student to the to student array
    public void addStudent(Student newStudent){

        students.add(newStudent);

    }

    //Sets the teacher
    public void setTeacher(Teacher newTeacher){

        teacher = newTeacher;

    }

    //Sets the teacher salary
    public void setSalary(int newSalary){

        teacher.setSalary(newSalary);

    }

    //Sets the subject
    public void setSubject(Subject newSubject){

        subject = newSubject;

    }

    //Sets a student's grade
    public void setGrade(int selection, int marks){

        students.get(selection).setGrade(marks);

    }

    //Prints all student grades
    public void printMarks(){

        for(int i = 0; i < students.size(); i++){

            System.out.println(students.get(i).getGrade());

        }

    }

    //Prints all student first names
    public void printStudentNames(){

        for(int i = 0; i < students.size(); i++){

            System.out.println((i + 1) + " - " + students.get(i).getFirstName());

        }


    }

    //Prints all teacher info
    public void printTeacherInfo(){

        teacher.toString();

    }

    //Prints all subject info
    public void printSubjectInfo(){

        subject.toString();

    }

    //Prints the class average
    public int getAverageGrade(){

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < students.size(); i++){

            sum += students.get(i).getGrade();
            counter++;

        }

        return sum/counter;

    }

}