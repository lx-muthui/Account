/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Alex Muthui
 */
public class Account {
    private double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void withdraw(double amount) {
        if (this.getBalance() < amount) {
            System.out.println("Insufficient Balance");
        }else {
            //this.balance = this.balance- amount;
            this.balance -= amount;
        }
    }
    
    public double deposit(float amount) {
        //updating balance
        this.balance += amount;
        
        //return current balance
        return this.getBalance();
    }
}
