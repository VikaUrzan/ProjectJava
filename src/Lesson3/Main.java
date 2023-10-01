package Lesson3;

public class Main {
    public static void main(String[] args) {
        Bank balance = new Bank();
        balance.MoneyWithdrawal(100, 10);
        balance.MoneyWithdrawal(0, 7);
        balance.MoneyWithdrawal(-1, 0);
        balance.MoneyWithdrawal(100, 99);

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        balance.WithdrawalMoneyAccount("Jane", 490, balances, ownerNames);

        int[] balances2 = {1200, 250, 2000, 500, 3200};
        String[] ownerNames2 = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        balance.fundMoneyAccount("Jane", 100, balances2, ownerNames2);


    }
}