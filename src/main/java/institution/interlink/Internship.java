package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private int id;
    private String name;
    private List<Student> students;

    public Internship() { }

    public Internship(String name) {
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

    public void addStudentsByUniversity(University university) {
        for (Student student : university.getStudents()) {
            if (student.getKnowledge().getLevel() >= university.getAverageStudentKnowledge()) {
                students.add(student);
            }
        }
    }

    public String getStudents() {
        return students.stream()
                .map(Student::getName)
                .reduce((x, y) -> x + "\n" + y)
                .orElse("Student's list is empty!");
    }
}
