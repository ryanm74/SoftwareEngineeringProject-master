package ie.gmit;


import java.util.UUID;

public class Student {

    private String Name;
    private String DOB;
    private int Age;
    private String ID;
    private Programme Programme;


    public Student(String name, String dob, int age) {
        this.Name = name;
        this.DOB = dob;
        this.Age = age;
        this.ID = createId();

    }


    //creating the username by concatinating name and age, removing spaces and making it all lower case
    public String getUsername() {
        return this.getName().replaceAll("\\s", "").toLowerCase() + this.getAge();
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
        return "Name: " + this.Name + " Age: " + this.Age + " ID: " + this.ID + " Username: " + this.getUsername();
    }
}
