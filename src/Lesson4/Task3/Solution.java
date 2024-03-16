package Lesson4.Task3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course myCourseJava = new Course(10, "JavaCourse", "Vlad");
        String teacherName = myCourseJava.getTeacherName();
        myCourseJava.setHoursDuration(12);
        Course newCoursePython = new Course(new Date(), "Python");
        Course newCourseSwift = new Course(15, "Swift", "Bogdan");
        Student studentVlad = new Student("First", "Alex", 15);
        Student allVladCourses = new Student("First", new Course[1]);
        CollegeStudent collegeStudentRating = new CollegeStudent("Dima", 10, 123456789);
        CollegeStudent collegeStudentName = new CollegeStudent("Urzan", "Vika", 15);
        CollegeStudent collegeStudentCourses = new CollegeStudent("Second", new Course[2]);
        SpecialStudent specialStudentKey = new SpecialStudent(15);
        SpecialStudent specialStudentRating = new SpecialStudent("Oleg", 25, 123445678);
        SpecialStudent specialStudentName = new SpecialStudent("Oleg", "Third", 15);
        SpecialStudent specialStudentSecretKeyVika = new SpecialStudent(456);
        SpecialStudent specialStudentGroupB = new SpecialStudent("Olya", "Next", 1);
    }
}