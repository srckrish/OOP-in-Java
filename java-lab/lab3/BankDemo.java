// 4. Create a class named Bank with a method getInterestRate() that displays "Interest Rate: 5%". Create two subclasses SavingsAccount and FixedDepositAccount that override the getInterestRate() method to display "Interest Rate: 7%" and "Interest Rate: 9%" respectively. Demonstrate method overriding by calling the method through objects of the subclasses.

class Bank {

    void getInterestRate() {
        System.out.println("Interest Rate: 5%");
    }
}

class SavingsAccount extends Bank {

    @Override
    void getInterestRate() {
        System.out.println("Interest Rate: 7%");
    }
}

class FixedDepositAccount extends Bank {

    @Override
    void getInterestRate() {
        System.out.println("Interest Rate: 9%");
    }
}

public class BankDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        bank.getInterestRate();      // Calls Bank's version
        savings.getInterestRate();   // Calls SavingsAccount's overridden version
        fd.getInterestRate();        // Calls FixedDepositAccount's overridden version
    }
}
