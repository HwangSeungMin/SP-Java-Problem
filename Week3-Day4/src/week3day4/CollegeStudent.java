package week3day4;

abstract class CollegeStudent {
    private String studentNumber;
    private String name;
    private double gpa;

    CollegeStudent(){
    }

    CollegeStudent(String studentNumber, String name, double gpa) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return " {" + "studentNumber='" + studentNumber + '\'' + ", name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}
