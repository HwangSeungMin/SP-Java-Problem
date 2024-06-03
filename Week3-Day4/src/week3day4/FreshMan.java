package week3day4;

public class FreshMan extends YoungGroupCollegeStudent{
    public FreshMan(String studentNumber,String name,double gpa) {
        super(studentNumber,name,gpa);
    }

    @Override
    public String toString() {
        return "FreshMan"+super.toString();
    }
}
