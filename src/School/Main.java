package School;

import java.io.*;

/**
 * 
 * @author A. Wong
 */

 public class Main{
    public static void main(String[] args) throws IOException{

      Teacher Fabroa = new Teacher("Eric", "Fabroa", "Over yonder", 416121451, 1000000);
      Student Adrian = new Student("Adrian", "Wong", "That way", 416987654, 85);
      Student Ben = new Student("Benjamin", "Teh", "Over there", 416423983, 94);
      Student Paul = new Student("Paul", "Tran", "Here", 416123131, 99);
      Subject compSci = new Subject(12, "Computer Science", "University", false);

      Classroom ICS4U1 = new Classroom(Fabroa, compSci);

      ICS4U1.addStudent(Adrian);
      ICS4U1.addStudent(Ben);
      ICS4U1.addStudent(Paul);

      String userInput1 = "0";
      String userInput2 = "0";
      int changeGradeSelect;
      int changeGradeScore;

      BufferedReader key = new BufferedReader(new InputStreamReader(System.in));


      while (!userInput1.equals("4")){

      System.out.println("What would you like to see?");
      System.out.println("1 - Students");
      System.out.println("2 - Teachers");
      System.out.println("3 - Subject");
      System.out.println("4 - Leave");

      userInput1 = key.readLine();

      switch(userInput1){

        case "1":
        
        System.out.println("What would you like to do?");
        System.out.println("1 - Print all marks");
        System.out.println("2 - Print average marks");
        System.out.println("3 - Set marks");
        System.out.println("4 - Add student");

        userInput2 = key.readLine();

        switch(userInput2){

          case "1": 

            ICS4U1.printMarks();

            break;

          case "2": 

            System.out.println(ICS4U1.getAverageGrade());

            break;

          case "3":

            System.out.println("Which student?");

            ICS4U1.printStudentNames();

            changeGradeSelect = Integer.parseInt(key.readLine());

            System.out.println("Input grade");

            changeGradeScore = Integer.parseInt(key.readLine());

            ICS4U1.setGrade(changeGradeSelect, changeGradeScore);

            break;

          case "4": 

            String studentInput1;
            String studentInput2;
            String studentInput3;
            int studentInput4;
            int studentInput5;
            
            System.out.println("Input student First name");

            studentInput1 = key.readLine();

            System.out.println("Input student Last name");

            studentInput2 = key.readLine();

            System.out.println("Input student Address");

            studentInput3 = key.readLine();

            System.out.println("Input student Emergency Contact number");

            studentInput4 = Integer.parseInt(key.readLine());

            System.out.println("Input student Grade");

            studentInput5 = Integer.parseInt(key.readLine());

            ICS4U1.addStudent(new Student(studentInput1, studentInput2, studentInput3, studentInput4, studentInput5));

            break;

        }

          break;

        case "2":

          ICS4U1.printTeacherInfo();

          System.out.println("What would you like to do?");
          System.out.println("1 - Set Salary");
          System.out.println("2 - Set New Teacher");

          userInput2 = key.readLine();

          switch(userInput2){

            case "1":

              int newSalary;

              System.out.println("Input new salary");

              newSalary = Integer.parseInt(key.readLine());

              ICS4U1.setSalary(newSalary);

              break;

            case "2": 

              String teacherInput1;
              String teacherInput2;
              String teacherInput3;
              int teacherInput4;
              int teacherInput5;
              
              System.out.println("Input teacher First name");

              teacherInput1 = key.readLine();

              System.out.println("Input teacher Last name");

              teacherInput2 = key.readLine();

              System.out.println("Input teacher Address");

              teacherInput3 = key.readLine();

              System.out.println("Input teacher Emergency Contact number");

              teacherInput4 = Integer.parseInt(key.readLine());

              System.out.println("Input teacher Salary");

              teacherInput5 = Integer.parseInt(key.readLine());

              ICS4U1.setTeacher(new Teacher(teacherInput1, teacherInput2, teacherInput3, teacherInput4, teacherInput5));

              break;

        }

          break;

        case "3":

          ICS4U1.printSubjectInfo();

          System.out.println("1 - Set new Subject");

          userInput2 = key.readLine();

          switch(userInput2){

            case "1": 

              int courseInput1;
              String courseInput2;
              String courseInput3;
              boolean courseInput4;

              System.out.println("Input Grade Level");

              courseInput1 = Integer.parseInt(key.readLine());

              System.out.println("Input Course Type");

              courseInput2 = key.readLine();

              System.out.println("Input Course Difficulty");

              courseInput3 = key.readLine();

              System.out.println("Input if Coop");

              courseInput4 = Boolean.parseBoolean(key.readLine());

              ICS4U1.setSubject(new Subject(courseInput1, courseInput2, courseInput3, courseInput4));

              break;

        }

          break;

      }

    }


    }
    
 }