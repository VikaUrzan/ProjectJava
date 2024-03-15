package Lesson4.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUser("Super", 1100, 10, "SuperUnlimited", 100, "USD");
        user.paySalary();
        user.withdraw(1000);
        user.companyNameLength();
        user.increaseEmploymentMonth(5);
    }
}