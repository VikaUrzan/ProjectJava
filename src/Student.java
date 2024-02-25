package Lesson4.Task3;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getGroup(){
        return this.group;
    }
    public Course[] getCoursesTaken(){
        return this.coursesTaken;
    }
    public int getAge(){
        return this.age;
    }

    public void Student (String newFirstName, String newLastName, int newGroup){
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.group = newGroup;
    }
    public void Student (String newLastName, Course[] newCoursesTaken){
        this.lastName = newLastName;
        this.coursesTaken = newCoursesTaken;
    }
}
