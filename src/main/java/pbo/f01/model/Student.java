package pbo.f01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "STUDENTS")
public class Student {
    @Id
    @Column(name = "id", nullable = false, length = 255)
    private String id;
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "entrance_year", nullable = false, length = 255)
    private String entranceYear;
    @Column(name = "gender", nullable = false, length = 255)
    private String gender;

    @ManyToOne
    private Dorm dorm;
    
    public Student() {
        this.id = "";
        this.name = "";
        this.entranceYear = "";
        this.gender = "";
    }

    public Student(String id, String name, String entranceYear, String gender) {
        this.id = id;
        this.name = name;
        this.entranceYear = entranceYear;
        this.gender = gender;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntranceYear() {
        return this.entranceYear;
    }

    public void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dorm getDorm() {
        return this.dorm;
    }

    public void setDorm(Dorm dorm) {
        this.dorm = dorm;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + entranceYear;
    }    
}