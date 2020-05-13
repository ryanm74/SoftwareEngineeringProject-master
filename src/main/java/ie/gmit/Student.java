package ie.gmit;


import java.util.ArrayList;
import java.util.UUID;

public class Student {

    private String Name;
    private ArrayList<Grade> Grades;
    private String DOB;
    private int Age;
    private String ID;
    private Programme Programme;
    private Object Grade;


    public Student(String name, String dob, int age) {
        this.Name = name;
        this.DOB = dob;
        this.Age = age;
        this.ID = createId();
        this.Grades = new ArrayList<>();

    }


    //getters and setters
    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public String getDOB() {
        return DOB;
    }


    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public int getAge() {
        return Age;
    }


    public void setAge(int Age) {
        this.Age = Age;
    }


    public String getID() {
        return ID;
    }

    public Programme getProgramme() {
        return Programme;
    }



    public Grade getStudent() {
        return null;
    }


    public void setProgramme(Programme Programme) {
        this.Programme = Programme;
    }

    //creating a unique student ID
    public String createId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + " Age: " + this.Age + " ID: " + this.ID;
    }


}
