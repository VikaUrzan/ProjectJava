package Lesson4.Task3;

import java.util.Date;

    public static void main(String[] args) {
        Course myCourseJava = new Course(10, "JavaCourse", "Vlad");
        String teacherName = myCourseJava.getTeacherName();
        myCourseJava.setHoursDuration(12);
        Course newCoursePython = new Course(new Date(), "Python");
        Course newCourseSwift = new Course(15, "Swift", "Bogdan");
        Student studentAlexFirst = new Student("Alex", "First", 15);
        Student coursesAlexFirst = new Student("First", new Course[1]);
        CollegeStudent collegeStudentID123456789 = new CollegeStudent("Dima", 10, 123456789);
        CollegeStudent collegeStudentVikaUrzan = new CollegeStudent("Vika", "Urzan", 15);
        CollegeStudent collegeStudentSecond = new CollegeStudent("Second", new Course[2]);
        SpecialStudent specialStudentKey15 = new SpecialStudent(15);
        SpecialStudent specialStudentID123445678 = new SpecialStudent("Oleg", 25, 123445678);
        SpecialStudent specialStudentOlegThird = new SpecialStudent("Oleg", "Third", 15);
        SpecialStudent specialStudentKey456 = new SpecialStudent(456);
        SpecialStudent specialStudentOlyaNext = new SpecialStudent("Olya", "Next", 1);
    }
}
