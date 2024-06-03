package week3day4;

public class Junior extends ElderGroupCollegeStudent{
    public Junior(String studentNumber,String name,double gpa) {
        super(studentNumber,name,gpa);
    }

    @Override
    public String toString() {
        return "Junior "+super.toString();
    }
}
