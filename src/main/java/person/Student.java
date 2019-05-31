package person;

import person.consciousness.Knowledge;

public class Student {

    private int id;
    private String name;
    private Knowledge knowledge;

    public Student() { }

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
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

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
