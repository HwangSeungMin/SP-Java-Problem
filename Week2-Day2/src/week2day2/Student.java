package week2day2;

public class Student {
    private final String name;
    private int id;
    private String major;
    private int grade;

    Student(String name, int id, String major, int grade) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
