package pbo.f01.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @Column(name="Id", nullable = false,length = 255)
    private String Id;
    @Column(name="name", nullable = false,length = 255)
    private String name;
    @Column(name="EntranceYear", nullable = false,length = 255)
    private String EntranceYear;
    @Column(name="gender", nullable = false,length = 255)
    private String gender;

    @ManyToOne(targetEntity=Dorm.class, cascade = CascadeType.ALL)
    @JoinTable(name = "student_dorm", joinColumns = @JoinColumn(name = "dorm_Id", referencedColumnName = "Id"), 
    inverseJoinColumns = @JoinColumn(name = "dorm_name", referencedColumnName = "name"))
    private List<Dorm> dorms = new ArrayList<>();

    public Student(){

     }

    public Student(String Id, String name, String EntranceYear,String gender){
        this.Id=Id;
        this.name=name;
        this.EntranceYear=EntranceYear;
        this.gender=gender;

    }

    public Student(String Id, String name, String EntranceYear, String gender,List<Dorm> dorms){
        this.Id=Id;
        this.name=name;
        this.EntranceYear= EntranceYear;
        this.gender=gender;
        this.dorms=dorms;
    }
   
    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.Id;
    }

    public String getGender(){
        return this.gender;
    }

    public String getEntranceYear(){
        return this.EntranceYear;
    }

    public void setId(String Id){
        this.Id = Id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setEntranceYear(String EntranceYear){
        this.EntranceYear= EntranceYear;
    }


    public List<Dorm> getDorms(){
        return this.dorms;
    }

    public void setDorms(List<Dorm> dorms){

        this.dorms= dorms;
    }

    @Override
    public String toString(){
        return Id +"|"+ name + "|" + EntranceYear;
    }






    
}

    