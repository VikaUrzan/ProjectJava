package Lesson4.Task3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public long getSecretKey() {
        return this.secretKey;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}