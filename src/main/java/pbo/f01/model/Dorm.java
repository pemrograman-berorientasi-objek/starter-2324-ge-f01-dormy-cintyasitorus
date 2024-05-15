package pbo.f01.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DORM")
public class Dorm {
    @Id
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "capacity", nullable = false)
    private short capacity;
    @Column(name = "gender", nullable = false, length = 255)
    private String gender;

    @OneToMany(mappedBy = "dorm")
    private List<Student> students = new ArrayList<>();

    public Dorm() {
        this.name = "";
        this.capacity = 0;
        this.gender = "";
    }
    
    public Dorm(String name, short capacity, String gender) {
        this.name = name;
        this.capacity = capacity;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCapacity() {
        return this.capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return name + "|" + gender + "|" + capacity + "|" + students.size();
    }
}
