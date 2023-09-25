package Lesson3;

public class Bank {

    public void MoneyResult (double balance, double withdrawal) {
        double commission = withdrawal*0.05;
        double BalanceResult = balance - commission - withdrawal;

        if (BalanceResult <=0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commission + " " + BalanceResult);
        }
    }

    public void MoneyOwner(String ownerName, double withdrawal, int[]balances, String[]ownerNames){
        int index = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                index = i;
                break;
            }
        }

        double commission = withdrawal*0.05;
        double MoneyOwnerResult = balances[index] - commission - withdrawal;

        if (MoneyOwnerResult <=0) {
            System.out.println("NO");
        } else {
            System.out.println(ownerName + " " + withdrawal + " " + MoneyOwnerResult);
        }
    }

    public void fundResultSum (String ownerName, double fund, int[]balances, String[]ownerNames){
        int index = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                index = i;
                break;
            }
        }

        double fundResult = balances[index] + fund;
        System.out.println(ownerName + " " + fundResult);
    }

}
