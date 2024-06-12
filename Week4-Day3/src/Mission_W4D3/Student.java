package Mission_W4D3;

public class Student {
    // 속성 (2) 학생 개인정보
    private String name; // 이
    private String gender; // 성별

    private int score;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}