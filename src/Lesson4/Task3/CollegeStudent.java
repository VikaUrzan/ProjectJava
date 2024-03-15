package Lesson4.Task3;

public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;


    public String getFirstNameCollegeStudent() {
        return super.getFirstName();
    }

    public String getLastNameCollegeStudent() {
        return super.getLastName();
    }

    public int getGroupCollegeStudent() {
        return super.getGroup();
    }

    public Course[] getCoursesTakenCollegeStudent() {
        return super.getCoursesTaken();
    }

    public int getAgeCollegeStudent() {
        return super.getAge();
    }

    public void setStudentNameGroupCollegeStudent(String newFirstName, String newLastName, int newGroup) {
        Student(newFirstName, newLastName, newGroup);
    }

    public void setNameCoursesCollegeStudent(String newLastName, Course[] newCoursesTaken) {
        Student(newLastName, newCoursesTaken);
    }

    public void setCollegeStudent(String newCollegeName, int newRating, long newId) {
        this.collegeName = newCollegeName;
        this.rating = newRating;
        this.id = newId;
    }
}
