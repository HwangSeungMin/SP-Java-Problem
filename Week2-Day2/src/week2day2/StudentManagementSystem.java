package week2day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import week2day2.Student;
public class StudentManagementSystem {
    private final int maxCntStudent;
    private final Map<String,Student> students = new HashMap<String,Student>();

    StudentManagementSystem(int maxCntStudent) {
        this.maxCntStudent = maxCntStudent;
    }

    public void addStudent(Student student) {
        if(this.students.containsKey(String.valueOf(student.getId()))){
            System.out.println("이미 등록된 학번의 학생 입니다."+student.getId());
        }else {
            if (students.size() < this.getMaxCntStudent()) {
                this.students.put(String.valueOf(student.getId()),student);
                System.out.println("학생 추가 :" + student.getName());
            } else {
                System.out.println("최대 정원 " + this.getMaxCntStudent() + " 명의 학생이 등록되어 있습니다.");
            }
        }
    }

    public void removeStudent(Student student) {
        if(this.students.containsKey(String.valueOf(student.getId()))){
            this.students.remove(String.valueOf(student.getId()));
            System.out.println("학생 삭제 : "+student.getName());
        }else {
            System.out.println("학생을 찾을 수 없습니다. 학번 : "+student.getId());
        }
    }

    public void searchStudent(int studentId) {
        if(this.students.containsKey(String.valueOf(studentId))){
            Student st1 = this.students.get(String.valueOf(studentId));
            System.out.println("이름 : "+st1.getName());
            System.out.println("학번 : "+st1.getId());
            System.out.println("전공 : "+st1.getMajor());
            System.out.println("학년 : "+st1.getGrade());
        }else {
            System.out.println("학생을 찾을 수 없습니다. 학번 : "+studentId);
        }
    }


    public int getMaxCntStudent() {
        return maxCntStudent;
    }

}
