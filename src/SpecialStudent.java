package Lesson4.Task3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public long getSecretKey(){
        return this.secretKey;
    }
    public String getEmail(){
        return this.getEmail();
    }

    public void setStudentNameGroupSpecialStudent (String newFirstName, String newLastName, int newGroup){
        Student(newFirstName, newLastName, newGroup);
    }
    public void setNameCoursesSpecialStudent (String newLastName, Course[] newCoursesTaken){
        Student(newLastName,newCoursesTaken);
    }

    public void setSpecialStudent (String newCollegeName, int newRating, long newId){
        setCollegeStudent(newCollegeName,newRating,newId);
    }

    public void setSecretKey (long newSecretKey){
        this.secretKey = newSecretKey;
    }
}
