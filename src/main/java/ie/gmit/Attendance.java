package ie.gmit;

import java.util.*;

public class Attendance {

    private String Attendance;
    private ArrayList<Student> Students;

    public Attendance(String attendance){
        Attendance = attendance;
        this.Students = new ArrayList<>();



    }

    public void setAttendance(String attendance){
        Attendance = attendance;
    }

    public String getAttendance(String days){
        return Attendance;
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

        return "Day of the week is: " + Attendance;
    }


}
