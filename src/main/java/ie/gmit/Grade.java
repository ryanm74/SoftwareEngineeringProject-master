package ie.gmit;


import java.util.*;

public class Grade {


    private String numGrades;
    private ArrayList<Student> Students;


    public Grade(String grades) {
        numGrades = grades;

        this.Students = new ArrayList();
    }
    public String getGrades(){
        return numGrades;
    }

    public void setGrades(String grades){
        numGrades = grades;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }


    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }

    //methods to add and delete students from the arraylist
    public void addStudent(Student s){
        Students.add(s);
    }

    public void deleteStudent(Student s){
        Students.remove(s);
    }


    @Override
    public String toString(){
        return "GPA IS" + numGrades;
    }

}
