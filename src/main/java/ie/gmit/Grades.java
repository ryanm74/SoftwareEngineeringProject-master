package ie.gmit;

import java.util.Scanner;
import static java.lang.System.*;

public class Grades {

    private int numGrades;

    public Grades(int grades) {
        numGrades = grades;
    }
    public int getGrades(){
        return numGrades;
    }
    public void setGrades(int grades){
        numGrades = grades;
    }

    public String getLetterGrades(){
        if(numGrades <0 || numGrades > 100) throw new IllegalArgumentException("No Grade!");

        else if(numGrades >= 85)
            return "A";
        else if(numGrades >= 70)
            return "B";
        else if(numGrades >= 60)
            return "C";
        else if(numGrades >= 40)
            return "D";
        else return "F";
    }

    @Override
    public String toString(){
        return numGrades + "is a " +getLetterGrades() + "\n";
    }
}
