package day33_CustomClass;

public class BankAccount {
/*
practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )

    requierements:
    1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requirements:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than a
					vailable balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0,
					user should not be able to withdraw money
			3. user should be able to see their balance
 */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        if (balance < 0){
            System.out.println("Invalid entry");
        } else {
            balance -= amount;
            if (balance < 0){
                balance -= 35;
        }

        }
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }

    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+
                "\nAvaalable Balance: "+balance;
        return result;
    }

}
