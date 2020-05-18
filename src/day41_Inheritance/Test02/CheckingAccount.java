package day41_Inheritance.Test02;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class CheckingAccount extends BankAccount {
    /*
    accountNumber, (inherited)
    accountHolder, (inherited)
    balance (inherited)

    deposit, (inherited)

    withdraw,

    showBalance (inherited)
    toString (inherited)

     */

    public void withdraw(int amount){
        balance -= amount;
    }

}
