package ie.gmit;

import java.util.*;

public class Module {
    private String Name;
    private String ID;
    private ArrayList<Student> Students;


    public Module(String name, String id){
        Name = name;
        ID = id;
        this.Students = new ArrayList();
    }


    //getters and setters
    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setID(String id){
        ID = id;
    }
    public String getID(){
        return ID;
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
        return "Module Name: " + Name + " Module ID: " + ID;
    }


}


