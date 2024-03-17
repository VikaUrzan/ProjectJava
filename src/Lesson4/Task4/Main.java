package Lesson4.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dima", 100, 3, "Super", 1000, "USD");
        user.setBalance(1800);
        user.paySalary();
        user.withdraw(1000);
        user.companyNameLength();
        user.increaseEmploymentMonth(5);
    }
}