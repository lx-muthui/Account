package account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Muthui
 */
public class TestAccount {
    public static void main(String [] args) {
        Account account1 = new Account(560000.50);
        account1.withdraw(5000);
        System.out.println("Balance: "+account1.getBalance());
        
    }
    
}
