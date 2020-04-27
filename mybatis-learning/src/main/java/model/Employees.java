package model;

import java.util.Date;

public class Employees {
    private int id;
    private String name;
    private int age;
    private String position;
    private Date hire_time;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHire_time() {
        return hire_time;
    }

    public void setHire_time(Date hire_time) {
        this.hire_time = hire_time;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", hire_time=" + hire_time +
                '}';
    }
}
