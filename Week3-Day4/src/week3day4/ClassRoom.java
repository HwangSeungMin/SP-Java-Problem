package week3day4;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ClassRoom<T extends CollegeStudent> {
    private String className;
    private Map<String,T> studentMap;
    private List<String> studentNames;

    public ClassRoom(String className){
        this.className = className;
        studentMap= new HashMap<>();
        studentNames = new ArrayList<>();
    }

    public void addStudent(T student) {
        studentMap.put(student.getStudentNumber(), student);
        studentNames.add(student.getName());
    }

    public T getStudentByStudentNumber(String studentNumber) {
        return studentMap.get(studentNumber);
    }


    public void printStudentNames() {
        System.out.println(className+" 학급에 포함된 학생 : "+String.join(",",studentNames));
    }
}
