package Lesson4.Task3;

import javax.xml.crypto.Data;

public class Course {
    private Data startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Data getStartDate() {
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

    public void setCourseDateName(Data newStartDate, String newName) {
        this.startDate = newStartDate;
        this.name = newName;
    }

    public void setCourseNameHoursTeacher(String newName, int newHoursDuration, String newTeacherName) {
        this.name = newName;
        this.hoursDuration = newHoursDuration;
        this.teacherName = newTeacherName;

    }
}