import java.util.ArrayList;
public class StudentManagementSystem {
    private final int maxCntStudent;
    private final ArrayList<Integer> studentIdList = new ArrayList<>();

    StudentManagementSystem(int maxCntStudent) {
        this.maxCntStudent = maxCntStudent;
    }

    public void addStudent(Student student) {
        if(this.studentIdList.contains(student.getId())){
            System.out.println("이미 등록된 학번의 학생 입니다."+student.getId());
        }else {
            if (studentIdList.size() < this.getMaxCntStudent()) {
                this.studentIdList.add(student.getId());
                System.out.println("학생 추가 :" + student.getName());
            } else {
                System.out.println("최대 정원 " + this.getMaxCntStudent() + " 명의 학생이 등록되어 있습니다.");
            }
        }
    }

    public void removeStudent(Student student) {
        if(this.studentIdList.contains(student.getId())){
            this.getStudentIdList().remove(Integer.valueOf(student.getId()));
            System.out.println("학생 삭제 : "+student.getName());
        }else {
            System.out.println("학생을 찾을 수 없습니다. 학번 : "+student.getId());
        }
    }

    public void searchStudent(int studentId) {
        if(this.getStudentIdList().contains(studentId)){
            System.out.println("존재하는 학생 입니다. 학번 : "+studentId);
        }else {
            System.out.println("학생을 찾을 수 없습니다. 학번 : "+studentId);
        }
    }


    public int getMaxCntStudent() {
        return maxCntStudent;
    }

    public ArrayList<Integer> getStudentIdList() {
        return studentIdList;
    }
}
