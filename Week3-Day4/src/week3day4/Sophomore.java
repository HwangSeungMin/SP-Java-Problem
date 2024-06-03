package week3day4;

public class Sophomore extends YoungGroupCollegeStudent{
    public Sophomore(String studentNumber,String name,double gpa) {
        super(studentNumber,name,gpa);
    }

    @Override
    public String toString() {
        return "Junior "+super.toString();
    }
}
