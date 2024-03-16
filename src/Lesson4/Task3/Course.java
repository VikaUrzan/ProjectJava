package Lesson4.Task3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getName() {
        return this.name;
    }

    public int getHoursDuration() {
        return this.hoursDuration;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}