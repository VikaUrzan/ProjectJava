package Lesson4.Task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getMonthsOfEmployment() {
        return this.monthsOfEmployment;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setUser(String newName, int newBalance, int newMonthsOfEmployment, String newCompanyName, int newSalary, String newCurrency) {
        this.name = newName;
        this.balance = newBalance;
        this.monthsOfEmployment = newMonthsOfEmployment;
        this.companyName = newCompanyName;
        this.salary = newSalary;
        this.currency = newCurrency;

    }

    public void paySalary() {
        balance += salary;
        System.out.println(balance);
    }

    public void withdraw(int summ) {
        double commission;
        if (summ > 1000) {
            commission = balance * 0.05;
            summ = (int) (balance - commission);
        } else {
            commission = balance * 0.1;
            summ = (int) (balance - commission);
        }
        System.out.println(summ);
    }

    public void companyNameLength() {
        System.out.println(companyName.length());
    }

    public void increaseEmploymentMonth(int addMonth) {
        int result = monthsOfEmployment + addMonth;
        System.out.println(result);
    }
}
