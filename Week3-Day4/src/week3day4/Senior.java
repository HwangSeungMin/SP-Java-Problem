package week3day4;

public class Senior extends ElderGroupCollegeStudent{
    public Senior(String studentNumber,String name,double gpa) {
        super(studentNumber,name,gpa);
    }

    @Override
    public String toString() {
        return "Senior "+super.toString();
    }
}
