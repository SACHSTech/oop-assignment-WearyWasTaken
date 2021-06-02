package School;


import java.util.ArrayList;

public class Classroom{

    private Teacher teacher;
    private Subject subject;
    private ArrayList<Student> students;

    public Classroom(Teacher theTeacher, Subject theSubject){
        
        teacher = theTeacher;
        subject = theSubject;
        students = new ArrayList<Student>();

    }

    public void addStudent(Student newStudent){

        students.add(newStudent);

    }

    public int getNumStudents(){

        return students.size();

    }

    public void setTeacher(Teacher newTeacher){

        teacher = newTeacher;

    }

    public void setSalary(int newSalary){

        teacher.setSalary(newSalary);

    }

    public void setSubject(Subject newSubject){

        subject = newSubject;

    }

    public void setGrade(int selection, int marks){

        students.get(selection).setGrade(marks);

    }

    public void printMarks(){

        for(int i = 0; i < students.size(); i++){

            System.out.println(students.get(i).getGrade());

        }

    }

    public void printStudentNames(){

        for(int i = 0; i < students.size(); i++){

            System.out.println((i + 1) + " - " + students.get(i).getFirstName());

        }


    }

    public void printTeacherInfo(){

        teacher.toString();

    }

    public void printSubjectInfo(){

        subject.toString();

    }

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