package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class University {

    private int id;
    private String name;
    private List<Student> students;

    public University() { }

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getAverageStudentKnowledge() {
        return students.stream()
                .map(Student::getKnowledge)
                .mapToInt(Knowledge::getLevel)
                .average()
                .orElse(Double.NaN);
    }
}
