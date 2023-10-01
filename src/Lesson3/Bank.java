package Lesson3;

public class Bank {

    public void MoneyWithdrawal (double balance, double withdrawal) {
        double commission = withdrawal * 0.05;
        double balanceResult = balance - commission - withdrawal;

        if (balanceResult <=0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commission + " " + balanceResult);
        }
    }

    public void WithdrawalMoneyAccount(String ownerName, double withdrawal, int[]balances, String[]ownerNames){
        int index = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                index = i;
            }
        }

        double commission = withdrawal * 0.05;
        double moneyOwnerResult = balances[index] - commission - withdrawal;

        if (moneyOwnerResult <=0) {
            System.out.println("NO");
        } else {
            System.out.println(ownerName + " " + withdrawal + " " + moneyOwnerResult);
        }
    }

    public void fundMoneyAccount (String ownerName, double fund, int[]balances, String[]ownerNames){
        int index = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                index = i;
            }
        }

        double fundResult = balances[index] + fund;
        System.out.println(ownerName + " " + fundResult);
    }

}
